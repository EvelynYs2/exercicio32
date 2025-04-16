package src.model;
import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    // Construtor padrão
    public Empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    // Construtor com parâmetros
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    // Métodos set
    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCep(String cep) { this.cep = cep; }
    public void setFone(String fone) { this.fone = fone; }

    // Métodos get
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public String getCep() { return cep; }
    public String getFone() { return fone; }

    // Solicitar dados ao usuário
    public void solicitarDados() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da empresa: ");
        this.nome = sc.nextLine();
        System.out.print("Endereço: ");
        this.endereco = sc.nextLine();
        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.print("Estado: ");
        this.estado = sc.nextLine();
        System.out.print("CEP: ");
        this.cep = sc.nextLine();
        System.out.print("Telefone: ");
        this.fone = sc.nextLine();
    }

    // Imprimir dados
    public void imprimirDados() {
        System.out.println("\n-- Dados da Empresa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
    }

    // Programa principal
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        emp.solicitarDados();
        emp.imprimirDados();
    }
}


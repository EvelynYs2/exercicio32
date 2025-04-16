package src.model;

import java.util.Scanner;

public class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedio;

    // Construtor padrão
    public Restaurante() {
        super();
        this.tipoComida = "";
        this.precoMedio = 0.0;
    }

    // Construtor com parâmetros
    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
                       String tipoComida, double precoMedio) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    // Métodos set
    public void setTipoComida(String tipoComida) { this.tipoComida = tipoComida; }
    public void setPrecoMedio(double precoMedio) { this.precoMedio = precoMedio; }

    // Métodos get
    public String getTipoComida() { return tipoComida; }
    public double getPrecoMedio() { return precoMedio; }

    // Solicitar dados do usuário
    public void solicitarDados() {
        super.solicitarDados();
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de comida: ");
        this.tipoComida = sc.nextLine();

        System.out.print("Preço médio do prato: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido.");
            sc.next();
        }
        this.precoMedio = sc.nextDouble();
        sc.nextLine(); 
    }

    // Imprimir dados
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.printf("Preço médio do prato: R$ %.2f%n", precoMedio);
    }
}

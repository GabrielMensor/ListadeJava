package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio05();
    }

    static void exercicio01() {
        String mensagem = "Bem-vindo ao Sistema de Geração de Jogadores!\n";
        // Mostro a mensagem final
        System.out.println(mensagem);
    }

    static void exercicio02() {
        String nomeCompleto = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        Double salario = 4500.00;
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    static void exercicio03() {
        String nome = "Teclado";
        int codigo = 12345;
        double preco = 99.9;
        boolean promocao = true;
        System.out.println("Nome: " + nome + "\n" + "Código: " + codigo + "\n" + "Preço: " + preco + "\n" + "Em Promoção: " + promocao);
    }

    static void exercicio04() {
        Scanner leitor = new Scanner(System.in);
        Double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextDouble();

        if(valorCompra > 100.00) {
            System.out.println("Preço Final: " + (valorCompra * 0.9));
        } else {
            System.out.println("Preço Final: " + valorCompra);
        }
    }

    static void exercicio05() {
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade < 12) {
            System.out.println("Categoria: Infantil");
        } else if(idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if(idade >= 18) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Algo de errado aconteceu");
        }
    }
}
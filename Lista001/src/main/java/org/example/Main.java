package org.example;

import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        exercicio09();
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

    static void exercicio06() {
        int[] notas = {7, 8, 6, 9, 10};

        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        System.out.println(notas);
        System.out.println("Média: " + soma/notas.length);
    }

    static void exercicio07() {
        double peso = 0;
        double altura = 0;
        double imc = 0;

        System.out.print("Digite o peso (kg): ");
        String pesoStr = leitor.next();
        pesoStr = pesoStr.replace(',', '.'); // aceita vírgula ou ponto
        try {
            peso = Double.parseDouble(pesoStr);
        } catch (NumberFormatException e) {
            System.out.println("Valor de peso inválido!");
            return;
        }

        System.out.print("Digite a altura (m): ");
        String alturaStr = leitor.next();
        alturaStr = alturaStr.replace(',', '.'); // aceita vírgula ou ponto
        try {
            altura = Double.parseDouble(alturaStr);
        } catch (NumberFormatException e) {
            System.out.println("Valor de altura inválido!");
            return;
        }

        imc = calcularIMC(peso, altura);

        System.out.printf("O IMC é: %.2f%n", imc);
    }
    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    static void exercicio08() {
        System.out.print("Digite o nome completo: ");
        String nome = leitor.nextLine();

        int numCaracteres = nome.replace(" ", "").length();

        String maiusculas = nome.toUpperCase();

        boolean contemSilva = nome.contains("Silva");

        // Saída
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Maiúsculas: " + maiusculas);
        System.out.println("Contém \"Silva\": " + contemSilva);
    }

    static void exercicio09() {
        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine(); // limpar o buffer do nextInt

        System.out.print("Digite o email: ");
        String email = leitor.nextLine();

        System.out.println("\n--- Cadastro realizado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}
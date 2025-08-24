package org.example;

public class Main {
    public static void main(String[] args) {
        exercicio03();

    }

    static void exercicio01() {
        Fatura faturaTeste = new Fatura("21515","primeiro",10,5);
        Fatura faturaTeste2 = new Fatura("85615", "segunda", 64, 10.9);

        faturaTeste.mostrarInfo();
        System.out.println("Valor total da fatura: " + faturaTeste.getTotalFatura());

        System.out.println("");

        faturaTeste2.mostrarInfo();
        System.out.println("Valor total da fatura: " + faturaTeste2.getTotalFatura());
    }

    static void exercicio02() {
        Empregado empregadoTeste1 = new Empregado("João", "da Silva", 1518.50);
        Empregado empregadoTeste2 = new Empregado("Maria", "Marques", 2025);

        System.out.println(empregadoTeste1.calcularsalarioAnual());
        System.out.println(empregadoTeste2.calcularsalarioAnual());

        empregadoTeste1.setSalarioMensal(empregadoTeste1.getSalarioMensal() * 1.1);
        empregadoTeste2.setSalarioMensal(empregadoTeste2.getSalarioMensal() * 1.1);

        System.out.println(String.format("%.2f", empregadoTeste1.calcularsalarioAnual())); // usado String.format para que apareça com o valor arrendondado
        System.out.println(String.format("%.2f", empregadoTeste2.calcularsalarioAnual()));
    }

    static void exercicio03() {
        Data datateste1 = new Data(12,12,2012);
        Data datateste2 = new Data(29,2,2016);
        Data datateste3 = new Data(10,5,2025);

        System.out.println(datateste1.displayData());
        System.out.println(datateste2.displayData());
        System.out.println(datateste3.displayData());

        //Data datateste4 = new Data(32, 12, 2021);
        //Data datateste5 = new Data(29,2,2025);        // testes que gerarão erros
        //Data datateste6 = new Data(12,23,2024);
    }
}
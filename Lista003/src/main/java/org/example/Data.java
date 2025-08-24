package org.example;

import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        validarData(dia, mes, ano); // validação já no construtor
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        validarData(this.dia, mes, this.ano);
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        validarData(dia, this.mes, this.ano);
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        validarData(this.dia, this.mes, ano);
        this.ano = ano;
    }

    private void validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }

        int[] diasPorMes = {
                31, // janeiro
                Year.isLeap(ano) ? 29 : 28, // fevereiro
                31, // março
                30, // abril
                31, // maio
                30, // junho
                31, // julho
                31, // agosto
                30, // setembro
                31, // outubro
                30, // novembro
                31  // dezembro
        };

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            throw new IllegalArgumentException(
                    "Dia inválido: " + dia + " para o mês " + mes + "/" + ano
            );
        }
    }

    public String displayData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

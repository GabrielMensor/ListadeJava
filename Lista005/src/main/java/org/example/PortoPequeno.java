package org.example;

import java.util.ArrayList;

public class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if(barco.getTamanho() <= 10) {
            this.barcosAtracados.add(barco);
            System.out.println(barco.getNome() + " atracado no " + this.getNome() + " (Porto Pequeno)");
        }
    }
}

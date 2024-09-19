package org.example;

public class Pato extends Animal implements Terrestre, Aquiatico, Voador{


    public Pato(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void andar() {
        System.out.println(getNome() + " está andando.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}

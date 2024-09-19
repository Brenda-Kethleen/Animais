package org.example;

public class Gaviao extends Animal implements Voador{

    private boolean predador;

    public Gaviao(String nome, String especie) {
        super(nome, especie);
    }

    public boolean isPredador() {
        return predador;
    }

    public void setPredador(boolean predador) {
        this.predador = predador;
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}

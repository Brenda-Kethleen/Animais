package org.example;

public class Cavalo extends Animal implements Terrestre{

    private String race;

    public Cavalo(String nome, String especie) {
        super(nome, especie);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void andar() {
        System.out.println(getNome() + " está andando.");
    }
}

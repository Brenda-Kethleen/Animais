package org.example;

public class Peixe extends Animal implements Aquiatico{

    private boolean aguaDoce;

    public Peixe(String nome, String especie) {
        super(nome, especie);
    }

    public boolean isAguaDoce() {
        return aguaDoce;
    }

    public void setAguaDoce(boolean aguaDoce) {
        this.aguaDoce = aguaDoce;
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
}

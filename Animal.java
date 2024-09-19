package org.example;

import java.sql.SQLOutput;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void comer(){
        System.out.println(nome + " está comendo.");
    }

    public void dormir(){
        System.out.println(nome + " está dormindo");
    }


}

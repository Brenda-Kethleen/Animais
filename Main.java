package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo("Cavalo", "Equino");
        Peixe peixe = new Peixe("Peixe", "Nemo");
        Gaviao gaviao = new Gaviao("Gaviao", "Fiel");
        Pato pato = new Pato("Pato", "Full");

        cavalo.andar();
        peixe.nadar();
        gaviao.voar();
        pato.andar();
        pato.nadar();
        pato.voar();

    }
}
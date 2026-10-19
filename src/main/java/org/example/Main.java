package org.example;

public class Main {
    public static void main(String[] args) {
        Brinquedo bonecaMoana = new Brinquedo();
        bonecaMoana.nome = "Moana";

        System.out.println(bonecaMoana.verBrinquedo(bonecaMoana));

        Brinquedo carrinho = new Brinquedo();
        carrinho.nome = "Hot Wheels";

        System.out.println(carrinho.verBrinquedo(carrinho));

        System.out.println(carrinho.soma(400, 32));
    }
}
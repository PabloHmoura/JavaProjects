package com.example.pablo;

public class Classes {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Audi";
        carro.modelo = "R8";
        carro.qtdPorta = 2;
        carro.cavalos = 700;
        carro.preco = 120;

        carro.status();

        carro.comprarCarro(500, carro.preco);



    }

}

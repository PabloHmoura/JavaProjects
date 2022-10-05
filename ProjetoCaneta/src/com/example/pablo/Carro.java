package com.example.pablo;



public class Carro {
    String modelo;
    String marca;
    String porta = "portas";
    int qtdPorta;
    int cavalos;

    double preco;

    public void status() {
        System.out.println("Carro " + this.modelo + " da marca " + this.marca + " com " + this.qtdPorta + " " + porta + " e " + cavalos + " cavalos de potência.");
    }

    void comprarCarro(double cart, double preco) {
        double c = cart;
        double p = preco;

        double result = c - p;
        if (p > c) {
            System.out.println("Você não tem dinheiro suficiente para adiquirir este carro." +
                    "Você possui " + c + " E o veículo custa " + p);
        } else if (c >= p){
            System.out.println("Você comprou uma " + this.marca + " " + this.modelo + " no valor de " + this.preco);

            System.out.println("Você possui agora um total de $" + result + " reais em sua carteira.");

        }


    }

}

/*
* 1. Classe Carro (Inspirada na "Analogia Master" das fontes)
• Atributos: marca, modelo, cor, ano, placa.
• Métodos: acelerar(), frear().
* */

public class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    String placa;

    public Carro (String marca, String modelo, String cor, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void acelerar(){
        System.out.println("Carro acelerou");
    }

    public void frear(){
        System.out.println("Carro freou");
    }
}
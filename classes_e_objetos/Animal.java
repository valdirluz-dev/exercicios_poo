/*
* 10. Classe Animal (ou Pet) (Inspirada nos exemplos de polimorfismo)
* Atributos: nome, especie, raca, idade, peso.
* Métodos: emitirSom(), comer(alimento).
* */


public class Animal {
    String nome;
    String especie;
    String raca;
    int idade;
    float peso;

    public Animal(String nome, String especie, String raca, int idade, float peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("O animal emitiu seu som natural!");
    }

    public void comer(String alimento){
        System.out.println("O animal comeu " + alimento);
    }
}
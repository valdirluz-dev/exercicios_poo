/*
* 5. Classe Televisor (Exemplo clássico de modelagem de objeto real)
• Atributos: marca, polegadas, volume, canalAtual, ligada (boolean).
• Métodos: ligar(), trocarCanal(novoCanal).
* */

public class Televisor {
    String marca;
    float polegadas;
    int volume;
    int canalAtual;
    boolean ligada = false;

    public Televisor(String marca, float polegadas, int volume, int canalAtual, boolean ligada) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.volume = volume;
        this.canalAtual = canalAtual;
        this.ligada = ligada;
    }

    public void ligar(){
        if (ligada){
            System.out.println("A TV ja está ligada!");
        }
        else {
            this.ligada = true;
            System.out.println("A TV ligou!");
        }
    }

    public void trocarCanal(int novoCanal){
        this.canalAtual = novoCanal;
        System.out.println("Você mudou para o canal " + this.canalAtual);
    }
}
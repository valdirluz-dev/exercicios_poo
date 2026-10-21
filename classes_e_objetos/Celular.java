/*
* 7. Classe Celular (Trabalha o conceito de escopo de instância)
• Atributos: numero, marca, modelo, empresa, nivelBateria.
• Métodos: enviarMensagem(texto), realizarChamada(numeroDestino).
* */

public class Celular {
    String numero;
    String marca;
    String modelo;
    String empresa;
    short nivelBateria;

    public Celular(String numero, String marca, String modelo, String empresa, short nivelBateria) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.empresa = empresa;
        this.nivelBateria = nivelBateria;
    }

    public void enviarMensagem(String texto){
        System.out.println("Mensagem enviada! \n conteúdo: \n" +
                "\"\"\"\n" + texto + "\n\"\"\"");
    }

    public void realizarChamada(String numeroDestino){
        System.out.println("Ligando para " + numeroDestino);
    }
}
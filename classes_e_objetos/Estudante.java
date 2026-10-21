/*
* 4. Classe Estudante (Referenciada para controle acadêmico)
* Atributos: nome, matricula, curso, idade, notaMedia.
* Métodos: registrarNota(valor), verificarSituacao() (ex:aprovado/reprovado).
*/


public class Estudante{
    String nome;
    String matricula;
    String curso;
    short idade;
    float notaMedia;

    public Estudante(String nome, String matricula, String curso, short idade, float notaMedia) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
        this.notaMedia = notaMedia;
    }

    public void registrarNota(float valor){
        this.notaMedia = valor;
    }

    public void verificarSituacao(){
        if (notaMedia >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }

    }
}
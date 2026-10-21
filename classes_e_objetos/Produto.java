/*
* 6. Classe Produto (Voltada para sistemas de vendas e estoque)
* Atributos: codigo, nome, descricao, precoVenda, quantidadeEstoque.
* Métodos: vender(quantidade), reporEstoque(quantidade).
* */


public class Produto {
    int codigo;
    String nome;
    String descricao;
    float precoVenda;
    int quantidadeEstoque;

    public Produto(int codigo, String nome, String descricao, float precoVenda, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade){
        this.quantidadeEstoque -= quantidade;
        System.out.println("Você vendeu: " + quantidade + " itens");
        System.out.println("estoque atual: " + quantidadeEstoque);
    }

    public void reporEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
        System.out.println("Você repôs: " + quantidade + " itens");
        System.out.println("estoque atual: " + quantidadeEstoque);
    }
}
/*
* 2. Classe ContaBancaria (Baseada no estudo de caso Account)
• Atributos: numero, titular, saldo, agencia, tipoConta.
• Métodos: depositar(valor), sacar(valor).
* */

public class ContaBancaria {
    int numero;
    String titular;
    float saldo;
    int agencia;
    String tipoConta;
    public ContaBancaria(int numero, String titular, float saldo, int agencia, String tipoConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }

    public void depositarValor(float valor){
        this.saldo += valor;
        System.out.println("Você depositou: " + valor + " Reais");
        System.out.println("Saldo atual");
    }

    public void sacarValor(float valor){
        if(valor > this.saldo){
        System.out.println("O valor não pode ser maior que o saldo atual");
        }
        else {
            this.saldo -= valor;
        }
    }
}
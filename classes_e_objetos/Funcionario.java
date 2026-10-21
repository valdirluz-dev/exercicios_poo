/*
* 3. Classe Funcionario (Conforme exemplos de RH nas fontes)
• Atributos: nome, cpf, cargo, salarioMensal, departamento.
• Métodos: calcularSalarioAnual(), aplicarAumento(percentual).
* */

public class Funcionario {
    String nome;
    String cpf;
    String cargo;
    float salarioMensal;
    float departamento;

    public Funcionario(String nome, String cpf, String cargo, float salarioMensal, float departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioMensal = salarioMensal;
        this.departamento = departamento;
    }

    public void calcularSalarioAnual(){
        System.out.println("Salario anual: R$ " + salarioMensal * 12);
    }

    public void aplicarAumento(float percentual){
        this.salarioMensal *= (1 + percentual)
        System.out.println("Novo salario: R$ " + salarioMensal);
    }
}
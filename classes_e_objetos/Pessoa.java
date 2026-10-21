/*
* 8. Classe Pessoa (Superclasse comum em hierarquias de herança)
* Atributos: nome, cpf, email, telefone, dataNascimento.
* Métodos: exibirDados(), validarCpf().
* */


public class Pessoa {
    String nome;
    String cpf;
    String email;
    String telefone;
    String dataNascimento;

    public Pessoa(String nome, String cpf, String email,
                  String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public void exibirDados() {
        System.out.println("Nome = " + nome);
        System.out.println("CPF = " + cpf);
        System.out.println("Email = " + email);
        System.out.println("Telefone = " + telefone);
        System.out.println("Data de nascimento = " + dataNascimento);
    }

    public boolean validarCPF() {
        if (cpf == null) {
            return false;
        }

        // Remove pontos e hífen
        String cpfLimpo = cpf.replaceAll("[.\\-]", "");

        // Verifica se possui exatamente 11 dígitos
        if (!cpfLimpo.matches("\\d{11}")) {
            return false;
        }

        // Rejeita sequências com todos os dígitos iguais
        if (cpfLimpo.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfLimpo.charAt(i))
                    * (10 - i);
        }

        int resto = soma % 11;
        int primeiroDigito = (resto < 2) ? 0 : 11 - resto;

        if (primeiroDigito !=
                Character.getNumericValue(cpfLimpo.charAt(9))) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;

        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpfLimpo.charAt(i))
                    * (11 - i);
        }

        resto = soma % 11;
        int segundoDigito = (resto < 2) ? 0 : 11 - resto;

        return segundoDigito ==
                Character.getNumericValue(cpfLimpo.charAt(10));
    }
}

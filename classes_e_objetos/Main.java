public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. TESTANDO CLASSE CARRO ===");
        Carro carro1 = new Carro("Toyota", "Corolla", "Prata", 2022, "ABC-1234");
        Carro carro2 = new Carro("Honda", "Civic", "Preto", 2023, "XYZ-5678");
        carro1.acelerar();
        carro2.frear();

        System.out.println("\n=== 2. TESTANDO CLASSE CONTA BANCARIA ===");
        ContaBancaria conta1 = new ContaBancaria(101, "Ana Silva", 1500.0f, 1, "Corrente");
        ContaBancaria conta2 = new ContaBancaria(102, "Bruno Souza", 3200.50f, 2, "Poupança");
        conta1.depositarValor(500.0f);
        conta2.sacarValor(1000.0f);

        System.out.println("\n=== 3. TESTANDO CLASSE FUNCIONARIO ===");
        Funcionario func1 = new Funcionario("Carlos Lima", "111.222.333-44", "Desenvolvedor", 5000.0f, 10.0f);
        Funcionario func2 = new Funcionario("Daniela Dias", "555.666.777-88", "Gerente", 8500.0f, 20.0f);
        func1.calcularSalarioAnual();
        func2.aplicarAumento(0.10f);

        System.out.println("\n=== 4. TESTANDO CLASSE ESTUDANTE ===");
        Estudante est1 = new Estudante("Eduardo Rocha", "202301", "Engenharia", (short) 20, 8.5f);
        Estudante est2 = new Estudante("Fernanda Costa", "202302", "Direito", (short) 22, 5.0f);
        est1.verificarSituacao();
        est2.registrarNota(7.5f);
        est2.verificarSituacao();

        System.out.println("\n=== 5. TESTANDO CLASSE TELEVISOR ===");
        Televisor tv1 = new Televisor("Samsung", 55.0f, 20, 5, false);
        Televisor tv2 = new Televisor("LG", 50.0f, 15, 12, true);
        tv1.ligar();
        tv1.trocarCanal(10);
        tv2.ligar();

        System.out.println("\n=== 6. TESTANDO CLASSE PRODUTO ===");
        Produto prod1 = new Produto(1, "Notebook", "Notebook i5 16GB", 3500.0f, 10);
        Produto prod2 = new Produto(2, "Mouse", "Mouse sem fio", 120.0f, 50);
        prod1.vender(3);
        prod2.reporEstoque(20);

        System.out.println("\n=== 7. TESTANDO CLASSE CELULAR ===");
        Celular cel1 = new Celular("(11) 98765-4321", "Apple", "iPhone 14", "Vivo", (short) 90);
        Celular cel2 = new Celular("(21) 91234-5678", "Xiaomi", "Redmi Note 12", "Claro", (short) 45);
        cel1.enviarMensagem("Olá, tudo bem?");
        cel2.realizarChamada("(21) 99999-9999");

        System.out.println("\n=== 8. TESTANDO CLASSE PESSOA ===");
        Pessoa p1 = new Pessoa("Gabriel Santos", "12345678909", "gabriel@email.com", "(11) 99888-7766", "15/05/1995");
        Pessoa p2 = new Pessoa("Helena Martins", "11144477735", "helena@email.com", "(21) 98877-6655", "20/10/2000");
        p1.exibirDados();
        System.out.println("CPF válido? " + p1.validarCPF());
        p2.exibirDados();
        System.out.println("CPF válido? " + p2.validarCPF());

        System.out.println("\n=== 9. TESTANDO CLASSE LIVRO ===");
        Livro liv1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "HarperCollins", "978-8595084759", 1200);
        Livro liv2 = new Livro("Dom Casmurro", "Machado de Assis", "Editora Garnier", "978-8572327533", 200);
        liv1.abrirLivro();
        liv2.lerPagina(50);

        System.out.println("\n=== 10. TESTANDO CLASSE ANIMAL ===");
        Animal anim1 = new Animal("Rex", "Canino", "Labrador", 3, 25.5f);
        Animal anim2 = new Animal("Mimi", "Felino", "Siamês", 2, 4.0f);
        anim1.emitirSom();
        anim2.comer("Ração úmida");
    }
}
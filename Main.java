public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Alice", "1234");
        Cliente cliente2 = new Cliente("Bob", "abcd");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        meuBanco.adicionarConta(cc);
        meuBanco.adicionarConta(poupanca);

        // Simulando autenticação
        if (cliente1.autenticar("1234")) {
            cc.depositar(1000);
            cc.transferir(300, poupanca);
        } else {
            System.out.println("Autenticação falhou!");
        }

        // Aplicando taxas/juros
        cc.aplicarTaxas();
        ((ContaPoupanca) poupanca).aplicarJuros();

        meuBanco.listarContas();
    }
}

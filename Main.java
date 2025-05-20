public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        meuBanco.adicionarConta(cc);
        meuBanco.adicionarConta(poupanca);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        meuBanco.listarContas();
    }
}

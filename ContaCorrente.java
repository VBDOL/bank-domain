public class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 12.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void aplicarTaxas() {
        saldo -= TAXA_MANUTENCAO;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}

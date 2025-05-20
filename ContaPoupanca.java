public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.005; // 0.5% ao mês

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
    }

    @Override
    public void aplicarTaxas() {
        aplicarJuros(); // Em vez de taxa, aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}

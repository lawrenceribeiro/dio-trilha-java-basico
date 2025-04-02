
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	
	@Override
	public String imprimirTipoConta() {
		// TODO Auto-generated method stub
		return "Conta Poupança";
	}
}

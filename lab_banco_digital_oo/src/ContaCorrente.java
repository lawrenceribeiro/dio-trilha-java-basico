
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public String imprimirTipoConta() {
		// TODO Auto-generated method stub
		return "Conta Corrente";
	}




	

	
}

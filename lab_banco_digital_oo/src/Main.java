
public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Central");

		Cliente venilton = new Cliente("Venilton");

		
		Conta cc = new ContaCorrente(venilton, banco);
		Conta poupanca = new ContaPoupanca(venilton, banco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		banco.listarContas();
		

	}

}

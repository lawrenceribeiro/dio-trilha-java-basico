import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = scanner.next();
		System.out.println("Por favor, digite o número da Conta !");
		int conta = scanner.nextInt();
		System.out.println("Por favor, digite o seu Nome !");
		String nome = scanner.next();
		System.out.println("Por favor, digite o seu saldo !");
		double saldo = scanner.nextDouble();
		System.out.println("Por favor, digite o seu saldo !");
		
		String mensagem = "Olá ".concat(nome)
			    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
			    .concat(agencia)
			    .concat(", conta ")
			    .concat(String.valueOf(conta))
			    .concat(" e seu saldo R$ ")
			    .concat(String.format("%.2f", saldo))
			    .concat(" já está disponível para saque.");

		System.out.println(mensagem);
		scanner.close();
			
 
		
		
		

		

	}

}

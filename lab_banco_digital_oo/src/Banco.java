import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Banco {
	   @Getter
	    private String nome;
	   	    
	    @Getter
	    private List<Conta> contas;

	    public Banco(String nome) {
	        this.nome = nome;
	        this.contas = new ArrayList<>();
	    }

	    public void adicionarConta(Conta conta) {
	        contas.add(conta);
	    }

	    public void listarContas() {
	        System.out.println("=== Contas do Banco " + nome + " ===");
	        for (Conta conta : contas) {
	            System.out.println("Cliente: " + conta.getCliente().getNome() +
	                               " | Agência: " + conta.getAgencia() +
	                               " | Número: " + conta.getNumero() +
	                               " | Tipo: " + conta.imprimirTipoConta() +
	                               " | Saldo: " + conta.getSaldo());
	        }
	    }

}

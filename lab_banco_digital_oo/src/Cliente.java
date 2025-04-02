import lombok.Getter;
import lombok.Setter;

public class Cliente {
	@Getter
	private String nome;
	
	public Cliente(String nome) {
	       this.nome = nome;
	}
}

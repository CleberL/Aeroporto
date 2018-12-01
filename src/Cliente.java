import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	private ArrayList<Passagem> passagens = new ArrayList<Passagem>();
	
	public Cliente(String nome) {
		super(nome);
	}
	
}

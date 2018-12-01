import java.util.ArrayList;

public class Empresa implements InterfaceEmpresa {

	private ArrayList<Voo> voos = new ArrayList<Voo>();

	public Voo procurarVoo(int cod) {
		for (Voo voo : voos) {
			if(voo.getCod() == cod)
				return voo;
		}
		return null;
	}

	public void addVoo(Voo novo) {
		this.voos.add(novo);
	}
	
}

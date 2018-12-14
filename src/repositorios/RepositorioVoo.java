package repositorios;

import java.util.ArrayList;
import models.Voo;

public class RepositorioVoo {

	private ArrayList<Voo> voos = new ArrayList<Voo>();

	public Voo procurarVoo(int cod) {
		for (Voo voo : voos) {
			if(voo.getCodigo() == cod)
				return voo;
		}
		return null;
	}

	public void addVoo(Voo novo) {
		this.voos.add(novo);
	}

	public void removeVoo(Voo remove) {
		// TODO Auto-generated method stub
		
	}
}

package models;

import java.util.ArrayList;

import interfaces.InterfaceEmpresa;

public class Empresa implements InterfaceEmpresa {

	private ArrayList<Voo> voos = new ArrayList<>();

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

	public void removeVoo(Voo remove) {
		// TODO Auto-generated method stub
		
	}
}

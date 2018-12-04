package Interfaces;
import Model.Voo;

public interface InterfaceEmpresa {
	
	public Voo procurarVoo(int cod);
	public void addVoo(Voo novo);
	public void removeVoo(Voo remove);
}

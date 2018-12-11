package interfaces;
import models.Voo;

public interface InterfaceEmpresa {
	
	Voo procurarVoo(int cod);
	void addVoo(Voo novo);
	void removeVoo(Voo remove);
}

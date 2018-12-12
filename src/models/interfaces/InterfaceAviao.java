package models.interfaces;
import models.Piloto;

public interface InterfaceAviao {

	Piloto getPiloto();
	void setPiloto(Piloto piloto);
	
	String getCod();
	void setCod(String cod);
	
	int getQtAssentos();
	void setQtAssentos(int qtAssentos);
	
}

package Interfaces;
import Model.Piloto;

public interface InterfaceAviao {

	public Piloto getPiloto();
	public void setPiloto(Piloto piloto);
	public String getCod();
	public void setCod(String cod);
	public int getQtAssentos();
	public void setQtAssentos(int qtAssentos);

}

package Interfaces;
import java.util.Date;

import Model.Aviao;
import Model.Local;

public interface InterfaceVoo {
	
	public Aviao getAviao();
	public void setAviao(Aviao aviao);
	public Local getOrigem();
	public void setOrigem(Local origem);
	public Local getDestino();
	public void setDestino(Local destino);
	public Date getData();
	public void setData(Date data);
	public int getCod();
	public void setCod(int cod);

}

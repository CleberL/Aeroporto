package models.interfaces;
import java.util.Date;

import models.Aviao;
import models.Local;

public interface InterfaceVoo {
	
	Aviao getAviao();
	void setAviao(Aviao aviao);
	Local getOrigem();
	void setOrigem(Local origem);
	Local getDestino();
	void setDestino(Local destino);
	Date getData();
	void setData(Date data);
	int getCod();
	void setCod(int cod);

}

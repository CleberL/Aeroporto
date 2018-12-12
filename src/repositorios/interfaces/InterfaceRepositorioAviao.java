package repositorios.interfaces;

import models.Aviao;

public interface InterfaceRepositorioAviao {

	Aviao procurarAviao(int codigo);
	void adicionarAviao(Aviao aviao);
	void removerAviao(Aviao aviao);
	void editarAviao(Aviao aviao);
	
}

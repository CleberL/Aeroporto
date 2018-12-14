package repositorios.interfaces;

import exception.PilotoException;
import models.Piloto;

public interface InterfaceRepositorioPiloto {

		Piloto procurarPiloto(int cpf) throws PilotoException;
		void adicionarPiloto(Piloto piloto) throws PilotoException, NullPointerException;
		void removerPiloto(Piloto piloto) throws PilotoException, NullPointerException;
		
}

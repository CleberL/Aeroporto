package repositorios.interfaces;

import exception.PilotoException;
import models.Piloto;

public interface InterfaceRepositorioPiloto {

	public interface InterfaceRepositorioAeronave {

		Piloto procurarPiloto(int codigo) throws PilotoException;
		void adicionarPiloto(Piloto aeronave) throws PilotoException, NullPointerException;
		void removerPiloto(Piloto aeronave) throws PilotoException, NullPointerException;

	}
}

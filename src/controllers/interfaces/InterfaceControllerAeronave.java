package controllers.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceControllerAeronave {

	public Aeronave procurarAeronave(int codigo) throws AeronaveException;
	public int adicionarAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException;

}

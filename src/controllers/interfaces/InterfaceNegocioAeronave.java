package controllers.interfaces;

import exception.AeronaveException;
import models.Aeronave;

public interface InterfaceNegocioAeronave {

	public Aeronave procurarAeronave(int codigo) throws AeronaveException;

	public void adicionarAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException;

	public void removerAeronave(Aeronave aeronave) throws AeronaveException, NullPointerException;

}

package controllers.interfaces;

import exception.NegocioAeronaveException;
import models.Aeronave;

public interface InterfaceNegocioAeronave {

	public Aeronave procurarAeronave(int codigo) throws NegocioAeronaveException;

	public void adicionarAeronave(Aeronave aeronave) throws NegocioAeronaveException, NullPointerException;

	public void removerAeronave(Aeronave aeronave) throws NegocioAeronaveException, NullPointerException;

}

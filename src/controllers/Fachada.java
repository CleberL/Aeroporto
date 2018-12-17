package controllers;

import controllers.interfaces.*;
import exception.*;
import models.*;

import java.util.Date;

public class Fachada implements InterfaceFachada {
	private InterfaceControllerAeronave controllerAeronave = new ControllerAeronave();
	private InterfaceControllerCliente controllerCliente = new ControllerCliente();
	private InterfaceControllerPassagem controllerPassagem = new ControllerPassagem();
	private InterfaceControllerPiloto controllerPiloto = new ControllerPiloto();
	private InterfaceControllerVoo controllerVoo = new ControllerVoo();


	@Override
	public int registrarAeronave(int assentos) throws AeronaveException {
		return controllerAeronave.adicionarAeronave(new Aeronave(assentos));
	}

	@Override
	public Aeronave consultarAeronave(int codAeronave) throws AeronaveException {
		return controllerAeronave.procurarAeronave(codAeronave);
	}

	@Override
	public int registrarCliente(String nome, String cpf) throws ClienteException {
		return controllerCliente;
	}

	@Override
	public Cliente consultarCliente(int codCliente) throws ClienteException {
		return null;
	}

	@Override
	public void modificarCliente(Cliente cliente) throws ClienteException {

	}

	@Override
	public int venderPassagem(int codCliente, int codVoo) throws PassagemException {
		return 0;
	}

	@Override
	public Passagem consultarPassagem(int codPassagem) throws PassagemException {
		return null;
	}

	@Override
	public void cancelarPassagem(int codPassagem) throws PassagemException {

	}

	@Override
	public int admitirPiloto(String nome, String cpf) throws PilotoException {
		return 0;
	}

	@Override
	public Piloto consultarPiloto(String cpf) throws PilotoException {
		return null;
	}

	@Override
	public void demitirPiloto(String cpf) throws PilotoException {

	}

	@Override
	public int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws VooException {
		return 0;
	}

	@Override
	public Voo consultarVoo(int codVoo) throws VooException {
		return null;
	}

	@Override
	public void cancelarVoo(int codVoo) throws VooException {

	}

	@Override
	public void modificarVoo(Voo voo) throws VooException {

	}
}

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
	public int registrarAeronave(int assentos) throws InvalidInputException {
		return 0;
	}

	@Override
	public Aeronave consultarAeronave(int codAeronave) throws NotFoundException {
		return null;
	}

	@Override
	public int registrarCliente(String nome, String cpf) throws InvalidInputException {
		return 0;
	}

	@Override
	public Cliente consultarCliente(int codCliente) throws NotFoundException {
		return null;
	}

	@Override
	public int venderPassagem(int codCliente, int codVoo) throws InvalidInputException {
		return 0;
	}

	@Override
	public Passagem consultarPassagem(int codPassagem) throws NotFoundException {
		return null;
	}

	@Override
	public void cancelarPassagem(int codPassagem) throws NotFoundException, InvalidInputException {

	}

	@Override
	public int admitirPiloto(String nome, String cpf) throws InvalidInputException {
		return 0;
	}

	@Override
	public Piloto consultarPiloto(String cpf) throws NotFoundException {
		return null;
	}

	@Override
	public void demitirPiloto(String cpf) throws NotFoundException, InvalidInputException {

	}

	@Override
	public int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws InvalidInputException {
		return 0;
	}

	@Override
	public Voo consultarVoo(int codVoo) throws NotFoundException {
		return null;
	}

	@Override
	public void cancelarVoo(int codVoo) throws NotFoundException, InvalidInputException {

	}
}

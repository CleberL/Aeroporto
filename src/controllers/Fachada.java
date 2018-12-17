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
		return controllerAeronave.adicionar(assentos);
	}

	@Override
	public Aeronave consultarAeronave(int codAeronave) throws NotFoundException {
		return controllerAeronave.procurar(codAeronave);
	}

	@Override
	public void registrarCliente(String nome, String cpf) throws InvalidInputException {
		controllerCliente.adicionar(nome, cpf);
	}

	@Override
	public Cliente consultarCliente(String cpf) throws NotFoundException {
		return controllerCliente.procurar(cpf);
	}

	@Override
	public int venderPassagem(int codCliente, int codVoo, int assento) throws InvalidInputException {
		return controllerPassagem.adicionar(codCliente, codVoo, assento);
	}

	@Override
	public Passagem consultarPassagem(int codPassagem) throws NotFoundException {
		return controllerPassagem.procurar(codPassagem);
	}

	@Override
	public void cancelarPassagem(int codPassagem) throws NotFoundException, InvalidInputException {
		controllerPassagem.remover(codPassagem);
	}

	@Override
	public void admitirPiloto(String nome, String cpf) throws InvalidInputException {
		controllerPiloto.adicionar(nome, cpf);
	}

	@Override
	public Piloto consultarPiloto(String cpf) throws NotFoundException {
		return controllerPiloto.procurar(cpf);
	}

	@Override
	public int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws InvalidInputException {
		return controllerVoo.adicionar(aeronave, origem, destino, piloto, horario);
	}

	@Override
	public Voo consultarVoo(int codVoo) throws NotFoundException {
		return controllerVoo.procurar(codVoo);
	}

	@Override
	public void cancelarVoo(int codVoo) throws NotFoundException, InvalidInputException {
		controllerVoo.remover(codVoo);
	}
}

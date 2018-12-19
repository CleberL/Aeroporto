package controllers;

import controllers.interfaces.*;
import exception.*;
import models.*;

import java.util.Date;
import java.lang.Math;

public class Fachada implements InterfaceFachada {
	private InterfaceControllerAeronave controllerAeronave = new ControllerAeronave();
	private InterfaceControllerCliente controllerCliente = new ControllerCliente();
	private InterfaceControllerPassagem controllerPassagem = new ControllerPassagem();
	private InterfaceControllerPiloto controllerPiloto = new ControllerPiloto();
	private InterfaceControllerVoo controllerVoo = new ControllerVoo();

	@Override
	public int registrarAeronave(int assentos) throws InvalidInputException {
		return controllerAeronave.adicionar(Math.abs(assentos));
	}

	@Override
	public Aeronave consultarAeronave(int codAeronave) throws NotFoundException {
		return controllerAeronave.procurar(codAeronave);
	}

	@Override
	public void registrarCliente(String nome, String cpf) throws InvalidInputException {
		if (cpf == null) {
			throw new InvalidInputException("CPF");
		}
		controllerCliente.adicionar(nome, cpf);
	}

	@Override
	public Cliente consultarCliente(String cpf) throws NotFoundException {
		return controllerCliente.procurar(cpf);
	}

	@Override
	public int venderPassagem(String cpfCliente, int codVoo, int assento) throws InvalidInputException, NotFoundException {
		int voo;
		if (!controllerVoo.verificarAssento(codVoo, assento) && controllerVoo.procurar(codVoo).getQtAssentos() > 0) {
			consultarCliente(cpfCliente);
			consultarVoo(codVoo);
			voo = controllerPassagem.adicionar(cpfCliente, codVoo, assento);
			controllerVoo.adicionarOcupado(codVoo, assento);
			controllerVoo.decrementarQtAssentos(codVoo);
		}else {
			throw new InvalidInputException("ASSENTO");
		}
		
		return voo;
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
		if (cpf == null) {
			throw new InvalidInputException("CPF");
		}
		controllerPiloto.adicionar(nome, cpf);
	}

	@Override
	public Piloto consultarPiloto(String cpf) throws NotFoundException {
		return controllerPiloto.procurar(cpf);
	}

	@Override
	public int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario)
			throws InvalidInputException, NotFoundException {
		consultarPiloto(piloto);
		consultarAeronave(aeronave);
		int assentos = controllerAeronave.procurar(aeronave).getAssentos();
		return controllerVoo.adicionar(aeronave, assentos, origem, destino, piloto, horario);
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

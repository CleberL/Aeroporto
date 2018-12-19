package controllers;

import exception.InvalidInputException;
import exception.NotFoundException;
import exception.PassagemException;
import controllers.interfaces.InterfaceControllerPassagem;
import models.Passagem;
import repositorios.RepositorioPassagem;
import repositorios.interfaces.InterfaceRepositorioPassagem;

import java.util.Random;

public class ControllerPassagem implements InterfaceControllerPassagem {

	InterfaceRepositorioPassagem repPassagem = new RepositorioPassagem();

	@Override
	public int adicionar(String cpfCliente, int voo, int assento) throws InvalidInputException {
		
		Random random = new Random();
		int codigo = random.nextInt(99999);

		Passagem passagem = new Passagem(codigo, voo, cpfCliente, assento);

		try {
			repPassagem.adicionar(passagem);
		} catch (PassagemException e) {
			codigo = adicionar(cpfCliente, voo, assento);
		} catch (NullPointerException e) {
			throw new InvalidInputException("PASSAGEM");
		}

		return codigo;
	}

	@Override
	public void remover(int codigo) throws NotFoundException, InvalidInputException {
		try {
			repPassagem.remover(new Passagem(codigo));
		} catch (PassagemException e) {
			throw new NotFoundException("PASSAGEM");
		} catch (NullPointerException e) {
			throw new InvalidInputException("PASSAGEM");
		}
	}

	@Override
	public Passagem procurar(int codigo) throws NotFoundException {
		Passagem passagem = repPassagem.procurar(codigo);

		if (passagem == null) {
			throw new NotFoundException("PASSAGEM");
		}

		return passagem;
	}

}

package controllers.interfaces;

import exception.*;

public interface InterfaceFachada {

	void venderPassagem(int codCliente, int codVoo) throws PassagemException;

	void consultarPassagens(int codPassagem) throws PassagemException;

	void cancelarPassagem(int codPassagem) throws PassagemException;

	int registrarCliente(String nome, String cpf);
}

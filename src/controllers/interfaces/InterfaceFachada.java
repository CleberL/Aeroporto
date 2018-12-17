package controllers.interfaces;

import exception.*;
import models.*;

import java.util.Date;

public interface InterfaceFachada {

    // Passagem
	int venderPassagem(int codCliente, int codVoo) throws PassagemException;
	Passagem consultarPassagem(int codPassagem) throws PassagemException;
	void cancelarPassagem(int codPassagem) throws PassagemException;

	// Cliente
	int registrarCliente(String nome, String cpf) throws ClienteException;
	Cliente consultarCliente(int codCliente) throws ClienteException;
	void modificarCliente(Cliente cliente) throws ClienteException;

	// Voo
	int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws VooException;
    Voo consultarVoo(int codVoo) throws VooException;
	void cancelarVoo(int codVoo) throws VooException;
    void modificarVoo(Voo voo) throws VooException;

    // Pilotos
    int registrarPiloto(String nome, String cpf) throws VooException;
    Piloto consultarPiloto(String cpf) throws VooException;

    // Aeronave
    int registrarAeronave(int assentos) throws VooException;
    int cancelarVoo() throws VooException;
    int cancelarVoo() throws VooException;
    int cancelarVoo() throws VooException;
}

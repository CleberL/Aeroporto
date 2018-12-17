package controllers.interfaces;

import exception.*;
import models.*;

import java.util.Date;

public interface InterfaceFachada {

    // Aeronave
    int registrarAeronave(int assentos) throws AeronaveException;
    Aeronave consultarAeronave(int codAeronave) throws AeronaveException;

    // Cliente
	int registrarCliente(String nome, String cpf) throws ClienteException;
	Cliente consultarCliente(int codCliente) throws ClienteException;
	void modificarCliente(Cliente cliente) throws ClienteException;

    // Passagem
    int venderPassagem(int codCliente, int codVoo) throws PassagemException;
    Passagem consultarPassagem(int codPassagem) throws PassagemException;
    void cancelarPassagem(int codPassagem) throws PassagemException;

    // Piloto
    int admitirPiloto(String nome, String cpf) throws PilotoException;
    Piloto consultarPiloto(String cpf) throws PilotoException;
    void demitirPiloto(String cpf) throws PilotoException;

    // Voo
	int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws VooException;
    Voo consultarVoo(int codVoo) throws VooException;
	void cancelarVoo(int codVoo) throws VooException;
    void modificarVoo(Voo voo) throws VooException;

}

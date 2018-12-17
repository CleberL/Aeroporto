package controllers.interfaces;

import exception.*;
import models.*;

import java.util.Date;

public interface InterfaceFachada {

    // Aeronave
    int registrarAeronave(int assentos) throws InvalidInputException;
    Aeronave consultarAeronave(int codAeronave) throws NotFoundException;

    // Cliente
	int registrarCliente(String nome, String cpf) throws InvalidInputException;
	Cliente consultarCliente(int codCliente) throws NotFoundException;

    // Passagem
    int venderPassagem(int codCliente, int codVoo) throws InvalidInputException;
    Passagem consultarPassagem(int codPassagem) throws NotFoundException;
    void cancelarPassagem(int codPassagem) throws NotFoundException, InvalidInputException;

    // Piloto
    int admitirPiloto(String nome, String cpf) throws InvalidInputException;
    Piloto consultarPiloto(String cpf) throws NotFoundException;
    void demitirPiloto(String cpf) throws NotFoundException, InvalidInputException;

    // Voo
	int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws InvalidInputException;
    Voo consultarVoo(int codVoo) throws NotFoundException;
	void cancelarVoo(int codVoo) throws NotFoundException, InvalidInputException;

}

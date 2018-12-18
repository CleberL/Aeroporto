package controllers.interfaces;

import exception.*;
import models.*;

import java.util.Date;

public interface InterfaceFachada {

    // Aeronave
    int registrarAeronave(int assentos) throws InvalidInputException;
    Aeronave consultarAeronave(int codAeronave) throws NotFoundException;

    // Cliente
	void registrarCliente(String nome, String cpf) throws InvalidInputException;
	Cliente consultarCliente(String cpf) throws NotFoundException;

    // Passagem
	int venderPassagem(String cpfCliente, int codVoo, int assento) throws InvalidInputException, NotFoundException;
    Passagem consultarPassagem(int codPassagem) throws NotFoundException;
    void cancelarPassagem(int codPassagem) throws NotFoundException, InvalidInputException;

    // Piloto
    void admitirPiloto(String nome, String cpf) throws InvalidInputException;
    Piloto consultarPiloto(String cpf) throws NotFoundException;

    // Voo
	int registrarVoo(int aeronave, String origem, String destino, String piloto, Date horario) throws InvalidInputException, NotFoundException;
    Voo consultarVoo(int codVoo) throws NotFoundException;
	void cancelarVoo(int codVoo) throws NotFoundException, InvalidInputException;

}

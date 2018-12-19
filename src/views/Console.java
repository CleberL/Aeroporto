package views;

import java.util.Date;

import controllers.Fachada;
import exception.InvalidInputException;
import exception.NotFoundException;

public class Console {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Fachada morganaAirlines = new Fachada();

		try {
			String cpf1 = "456789";
			morganaAirlines.admitirPiloto("Cleber", cpf1);
			int aeronave1 = morganaAirlines.registrarAeronave(200);
			System.out.println("Código da aeronave 1: " + aeronave1);
			
			int voo1 = morganaAirlines.registrarVoo(aeronave1, "Recife", "Buenos Aires", cpf1, new Date(2018, 12, 22, 15, 30));
			
			morganaAirlines.registrarCliente("jonatan", "123456");
			morganaAirlines.registrarCliente("lucas", "156465");
			morganaAirlines.registrarCliente("jojo", "531877");

			morganaAirlines.venderPassagem("156465", voo1, 24);
			morganaAirlines.venderPassagem("123456", voo1, 25);	
			
			
			
		} catch (InvalidInputException e) {
			System.out.println("Parametro inválido " + e.getMessage());
		} catch (NotFoundException e) {
			System.out.println("Parametro não encontrado " + e.getMessage());
		}
		
		

	}
}
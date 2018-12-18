package views;

import java.util.Date;

import controllers.Fachada;
import exception.InvalidInputException;
import exception.NotFoundException;

public class Console {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Fachada fachada = new Fachada();

		System.out.println("Executando Testes...");

		try {
			
			fachada.admitirPiloto("Cleber", "456789");
			int aeronave1 = fachada.registrarAeronave(152);
			System.out.println(aeronave1);

			
			int voo1 = fachada.registrarVoo(aeronave1, "Recife", "Buenos Aires", "456789", new Date(2018, 12, 22, 15, 30));
			
			
			fachada.registrarCliente("jonatan", "123456");
			fachada.registrarCliente("lucas", "156465");
			fachada.registrarCliente("jojo", "531877");

			fachada.venderPassagem("156465", voo1, 24);
			fachada.venderPassagem("123456", voo1, 25);	
			
			
			
			
		} catch (InvalidInputException e) {
			System.out.println("Parametro inválido " + e.getMessage());
		} catch (NotFoundException e) {
			System.out.println("Parametro não encontrado " + e.getMessage());
		}
		
		
		System.out.println("Fim dos testes.");
	}
}
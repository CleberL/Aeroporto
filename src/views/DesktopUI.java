package views;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import views.actions.*;

public class DesktopUI extends JFrame {
	JButton vender = new JButton("Vender Passagem");
	JButton cadastrar = new JButton("Registrar");
	JButton cancelar = new JButton("Cancelar");
	JButton consultar = new JButton("Consultar");
	
	public DesktopUI() {
		Container pane = this.getContentPane();

		Container centro = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		centro.setLayout(new FlowLayout(FlowLayout.CENTER));
		

		pane.add(vender);
		pane.add(cadastrar);
		pane.add(cancelar);
		pane.add(consultar);
		
		
		vender.addActionListener(new VenderPassagem());
		cadastrar.addActionListener(new Cadastrar());
//		cancelar.addActionListener(new Cancelar());
	//	consultar.addActionListener(new Consultar());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DesktopUI();
	}

}

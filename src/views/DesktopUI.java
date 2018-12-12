package views;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import views.actions.ComprarPassagem;

public class DesktopUI extends JFrame {
	JButton button1 = new JButton("Está vivo!!!");
	
	public DesktopUI() {
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.add(button1);
		button1.addActionListener(new ComprarPassagem());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DesktopUI();
	}

}

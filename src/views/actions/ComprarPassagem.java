package views.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComprarPassagem implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Morgana vai pro céu");
		new Thread() {
			public void run() {
				System.out.println("Morgana vai pro céu");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Morgana vai pro céu");
			}
		};
	}
	
}

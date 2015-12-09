import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageInscriptionGUI extends JFrame {
	
	private JPanel container = new JPanel();
	
	private JLabel lNom = new JLabel("Nom :");
	private JLabel lPrenom = new JLabel("Prenom :");
	private JLabel lPseudo = new JLabel("Pseudo :");
	private JLabel lPhoto = new JLabel("Photo :");
	
	protected JTextField tNom = new JTextField(15);
	protected JTextField tPrenom = new JTextField(15);
	protected JTextField tPseudo = new JTextField(15);
	protected JTextField tPhoto = new JTextField(15);
	
	private JButton b1 = new JButton("Annuler");
	private JButton b2 = new JButton("Inscription");

	
	// Constructor

	public PageInscriptionGUI() {

		this.setSize(250, 250);  //size de la fenetre
		this.setTitle("Inscription"); //titre de la fenetre
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.AjoutElements(); //ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	
	// Methods
	
	private void AjoutElements() {
		
		container.setBackground(Color.LIGHT_GRAY);
	    container.setLayout(new GridLayout(5, 2, 5, 5));
	    
		lNom.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lNom);
		container.add(tNom);
		
		lPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPrenom);
		container.add(tPrenom);
		
		lPseudo.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPseudo);
		container.add(tPseudo);
		
		lPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPhoto);
		container.add(tPhoto);
		
		b1.addActionListener(new b1Listener());     
	    b2.addActionListener(new b2Listener());
		container.add(b1);
		container.add(b2);
	}
	
	//Classes ecoutant les Boutons	  
	public class b1Listener implements ActionListener { 		// b1 bouton annuler
		public void actionPerformed(ActionEvent e1) {
			if((JButton)e1.getSource()==b1) {
				setVisible(false);
			}
		}
	}
	  
	public class b2Listener implements ActionListener {			// b2 bouton connexion
		public void actionPerformed(ActionEvent e2) {
			if((JButton)e2.getSource()==b2) {
				
			}
		}  
	}	
}
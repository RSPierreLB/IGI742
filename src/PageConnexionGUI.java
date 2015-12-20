import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageConnexionGUI extends JFrame implements ActionListener {

	private JPanel container = new JPanel();
	
	private JLabel lLogin = new JLabel("Login :");
	private JLabel lPassword = new JLabel("Password :");
	private JLabel lCreation = new JLabel("Pas de compte ?");
	
	protected JTextField tLogin = new JTextField(15);
	protected JPasswordField tPassword = new JPasswordField(15);
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_connexion = new JButton("Connexion");
	private JButton bouton_creer_compte = new JButton("Creer un compte");
	
	
	// Constructor

	public PageConnexionGUI() {
		this.setSize(250, 200);  //size de la fenetre
		this.setTitle("Connexion"); //titre de la fenetre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
	    container.setLayout(new GridLayout(4, 2, 5, 5));
	    
		lLogin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lLogin);
		container.add(tLogin);
		
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPassword);
		container.add(tPassword);
		
		bouton_annuler.addActionListener(this);
		bouton_annuler.setActionCommand("Annuler");
		container.add(bouton_annuler);  
		
	    bouton_connexion.addActionListener(this);
	    bouton_connexion.setActionCommand("Connexion");
		container.add(bouton_connexion);
		
		lCreation.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lCreation);
		
		bouton_creer_compte.addActionListener(this);
		bouton_creer_compte.setActionCommand("Creer_compte");
		container.add(bouton_creer_compte);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Annuler")) {
			tLogin.setText(null);
			tPassword.setText(null);
			this.dispose();
		}
		
		if(event.getActionCommand().equals("Connexion")) {
			//doit vérifier les identifiants avant dans la base de donnée
			PageConnecterGUI pc = new PageConnecterGUI();
			this.dispose();
			//Fermer la page NonConnecter
		}
		
		if(event.getActionCommand().equals("Creer_compte")) {
			PageInscriptionGUI pi = new PageInscriptionGUI();
		}
	}
	
}
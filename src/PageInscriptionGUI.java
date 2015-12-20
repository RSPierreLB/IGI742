import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageInscriptionGUI extends JFrame implements ActionListener {
	
	private JPanel container = new JPanel();
	
	private JLabel lNom = new JLabel("Nom :");
	private JLabel lPrenom = new JLabel("Prenom :");
	private JLabel lPseudo = new JLabel("Pseudo :");
	private JLabel lPhoto = new JLabel("Photo :");
	private JLabel lContact = new JLabel("Téléphone :");
	private JLabel lLogin = new JLabel("Login :");
	private JLabel lPassword = new JLabel("Password :");
	
	protected JTextField tNom = new JTextField();
	protected JTextField tPrenom = new JTextField();
	protected JTextField tPseudo = new JTextField();
	protected JTextField tPhoto = new JTextField();
	protected JTextField tContact = new JTextField();
	protected JTextField tLogin = new JTextField();
	protected JPasswordField tPassword = new JPasswordField();
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_inscription = new JButton("Inscription");

	private JOptionPane jOpInscription = new JOptionPane();
	
	// Constructor

	public PageInscriptionGUI() {

		this.setSize(250, 350);  //size de la fenetre
		this.setTitle("Inscription"); //titre de la fenetre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		this.AjoutElements(); //ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	
	// Methods
	
	private void AjoutElements() {
		
		container.setBackground(Color.LIGHT_GRAY);
	    container.setLayout(new GridLayout(8, 2, 5, 5));
	    
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
		
		lContact.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lContact);
		container.add(tContact);
		
		lLogin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lLogin);
		container.add(tLogin);
		
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPassword);
		container.add(tPassword);
		
		bouton_annuler.addActionListener(this);
		bouton_annuler.setActionCommand("Annuler");
		container.add(bouton_annuler);
		
	    bouton_inscription.addActionListener(this);
	    bouton_inscription.setActionCommand("Inscription");
		container.add(bouton_inscription);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Annuler")) {
			tNom.setText(null);
			tPrenom.setText(null);
			tPseudo.setText(null);
			tPhoto.setText(null);
			this.dispose();
		}
		
		if(event.getActionCommand().equals("Inscription")) {
			//Ajouter les info à la base de donnée
			PageConnexionGUI pc = new PageConnexionGUI();
			this.dispose();
			jOpInscription.showMessageDialog(null, "Welcome", "Inscription réussi", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	

}
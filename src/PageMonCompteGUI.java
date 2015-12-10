import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageMonCompteGUI extends JFrame implements ActionListener {

	private JPanel container = new JPanel();
	
	private JLabel lNom = new JLabel("Nom :");
	private JLabel lPrenom = new JLabel("Prenom :");
	private JLabel lPseudo = new JLabel("Pseudo :");
	private JLabel lPhoto = new JLabel("Photo :");
	private JLabel lLogin = new JLabel("Login :");
	private JLabel lPassword = new JLabel("Password :");
	
	protected JTextField tNom = new JTextField(15);
	protected JTextField tPrenom = new JTextField(15);
	protected JTextField tPseudo = new JTextField(15);
	protected JTextField tPhoto = new JTextField(15);
	protected JTextField tLogin = new JTextField(15);
	protected JPasswordField tPassword = new JPasswordField(15);
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_modifier = new JButton("Modifier");

	
	// Constructor
	
	public PageMonCompteGUI() {

		this.setSize(300, 350);  //size de la fenetre
		this.setTitle("Mon compte"); //titre de la fenetre
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.AjoutElements(); //ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}

		
	private void AjoutElements() {
		
		container.setBackground(Color.LIGHT_GRAY);
	    container.setLayout(new GridLayout(7, 2, 5, 5));     
	    
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
		
		lLogin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lLogin);
		container.add(tLogin);
		
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPassword);
		container.add(tPassword);
		
		bouton_annuler.addActionListener(this);
		bouton_annuler.setActionCommand("Annuler");
		container.add(bouton_annuler);  
		
		bouton_modifier.addActionListener(this);
		bouton_modifier.setActionCommand("Modifier");
		container.add(bouton_modifier);
	    
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Annuler")) {
			//doit fermer cette page
		}
		
		if(event.getActionCommand().equals("Modifier")) {
			PageConnecterGUI pc = new PageConnecterGUI();
		}
	}
	
}

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
	private JLabel lContact = new JLabel("Téléphone :");
	private JLabel lPassword = new JLabel("Password :");
	
	protected JTextField tNom = new JTextField();
	protected JTextField tPrenom = new JTextField();
	protected JTextField tPseudo = new JTextField();
	protected JTextField tPhoto = new JTextField();
	protected JTextField tContact = new JTextField();
	protected JPasswordField tPassword = new JPasswordField();
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_modifier = new JButton("Modifier");

	
	// Constructor
	
	public PageMonCompteGUI() {

		this.setSize(300, 350);  //size de la fenetre
		this.setTitle("Mon compte"); //titre de la fenetre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
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
		
		lContact.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lContact);
		container.add(tContact);
		
		lPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPhoto);
		container.add(tPhoto);
		
		lPseudo.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPseudo);
		container.add(tPseudo);
		
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
			tNom.setText(null);
			tPrenom.setText(null);
			tPseudo.setText(null);
			tPhoto.setText(null);
			tContact.setText(null);
			tPassword.setText(null);
			this.dispose();
		}
		
		if(event.getActionCommand().equals("Modifier")) {
			//Modifier les infos de la base de donnée
			PageConnecterGUI pc = new PageConnecterGUI();
			this.dispose();
		}
	}
	
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class PageMonCompteGUI extends JFrame {

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
	
	private JButton bAnnuler = new JButton("Annuler");
	private JButton bModifier = new JButton("Modifier");

	
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
		
		bAnnuler.addActionListener(new bAnnulerListener());
		container.add(bAnnuler);  
		
		bModifier.addActionListener(new bModifierListener());
		container.add(bModifier);
	    
	}
	
	//Classes ecoutant les Boutons	  
	public class bAnnulerListener implements ActionListener { 		// b1 bouton annuler
		public void actionPerformed(ActionEvent e1) {
			if((JButton)e1.getSource()==bAnnuler) {
				setVisible(false);
			}
		}
	}
	  
	public class bModifierListener implements ActionListener {			// b2 bouton connexion
		public void actionPerformed(ActionEvent e2) {
			if((JButton)e2.getSource()==bModifier) {
				
			}
		}  
	}

}

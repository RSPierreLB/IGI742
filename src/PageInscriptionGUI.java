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
	private JLabel lContact = new JLabel("Contact :");
	private JLabel lPassword = new JLabel("Password :");
	private JLabel lDescription = new JLabel("Descritpion :");
	
	protected JTextField tNom = new JTextField();
	protected JTextField tPrenom = new JTextField();
	protected JTextField tPseudo = new JTextField();
	protected JTextField tPhoto = new JTextField();
	protected JTextField tContact = new JTextField();
	protected JPasswordField tPassword = new JPasswordField();
	protected JTextArea textDescription = new JTextArea();
	
	private JScrollPane scrollDesc = new JScrollPane(textDescription);
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_inscription = new JButton("Inscription");

	private JOptionPane jOpInscription = new JOptionPane();
	
	// Constructor

	public PageInscriptionGUI() {

		this.setSize(250, 350);									//size de la fenetre
		this.setTitle("Inscription");							//titre de la fenetre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		this.AjoutElements();									//ajouter les elements qui sont dans la fonction
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
		
		lPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPhoto);
		container.add(tPhoto);
		
		lContact.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lContact);
		container.add(tContact);
		
		lPseudo.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPseudo);
		container.add(tPseudo);
		
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPassword);
		container.add(tPassword);
		
		lDescription.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lDescription);
		container.add(scrollDesc);
		
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
			tPhoto.setText(null);
			tContact.setText(null);
			tPseudo.setText(null);
			tPassword.setText(null);
			textDescription.setText(null);
			this.dispose();
		}
		
		if(event.getActionCommand().equals("Inscription")) {
			//Ajouter les info à la base de donnée
			PageConnexionGUI pc = new PageConnexionGUI();
			this.dispose();
			
			if(tNom.getText().isEmpty() || tPrenom.getText().isEmpty() || tPseudo.getText().isEmpty() || tPassword.getText().isEmpty() || tContact.getText().isEmpty()){
				jOpInscription.showMessageDialog(null, "L'un des champs suivant est vide: Nom, Prenom, Pseudo ou Password", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			else{
				if(textDescription.getText().isEmpty() ^ tPhoto.getText().isEmpty()){
					jOpInscription.showMessageDialog(null, "Vous devez soit remplir descritpion et photo soit laisser les deux champs vide", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
				else if(textDescription.getText().isEmpty() && tPhoto.getText().isEmpty()){
					Profil p = new Profil(tPrenom.getText(), tNom.getText(), tContact.getText(), tPseudo.getText(), tPassword.getText());
					jOpInscription.showMessageDialog(null, "Inscription réussi", "Welcome", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					Profil p = new Profil(tPrenom.getText(), tNom.getText(), tContact.getText(), tPseudo.getText(), tPassword.getText(), tDescription.getText(), tPhoto.getText());
					jOpInscription.showMessageDialog(null, "Inscription réussi", "Welcome", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	

}
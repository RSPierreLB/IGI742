import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;


public class PageDeposerAnnonceGUI extends JFrame implements ActionListener {
	
	private JPanel container = new JPanel();
	
	String[] tab = {"Sélectionner", "Prix", "Service"};
	private JComboBox jServPrix = new JComboBox(tab);
	
	private JLabel lTitre = new JLabel("Titre :");
	private JLabel lDescription = new JLabel("Description :");
	private JLabel lPrix = new JLabel("Prix :");
	private JLabel lContact = new JLabel("Coordonnée :");
	private JLabel lService = new JLabel("Service :");
	private JLabel lPhoto = new JLabel("Photo :");
	private JLabel lVide = new JLabel("");
	
	protected JTextField tTitre = new JTextField();
	protected JTextField tPhoto = new JTextField();
	protected JTextField tPrix = new JTextField();
	protected JTextField tContact = new JTextField();
	protected JTextArea textService = new JTextArea();
	protected JTextArea textDescription = new JTextArea();

	private JScrollPane scrollDesc = new JScrollPane(textDescription);
	private JScrollPane scrollService = new JScrollPane(textService);
	
	private JButton bouton_annuler = new JButton("Annuler");
	private JButton bouton_deposer = new JButton("Deposer");
	
	
	// Constructor

	public PageDeposerAnnonceGUI() {
		
		this.setSize(350, 350);  //size de la fenetre
		this.setTitle("Déposer une annonce"); //titre de la fenetre
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
	    container.setLayout(new GridLayout(8, 2, 5, 5));
	    
	    lTitre.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lTitre);
		container.add(tTitre);
		
		lPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPhoto);
		container.add(tPhoto);
		
		lContact.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lContact);
		container.add(tContact);

		lDescription.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lDescription);
		container.add(scrollDesc);
		
		container.add(jServPrix);
		jServPrix.addActionListener(new jServPrixListener());
		
		container.add(lVide);
		
		lPrix.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPrix);
		container.add(tPrix);
		tPrix.enable(false);
		tPrix.setBackground(Color.LIGHT_GRAY);
		
		lService.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lService);
		container.add(scrollService);
		textService.enable(false);
		textService.setBackground(Color.LIGHT_GRAY);
		
		bouton_annuler.addActionListener(this);
		bouton_annuler.setActionCommand("Annuler");
		container.add(bouton_annuler);  
		
	    bouton_deposer.addActionListener(this);
	    bouton_deposer.setActionCommand("Deposer");
		container.add(bouton_deposer);

	}
	
	public class jServPrixListener implements ActionListener {
		public void actionPerformed(ActionEvent e1) {
			String result = (String) jServPrix.getSelectedItem();
			if(result == "Prix"){
				tPrix.enable(true);
				tPrix.setBackground(Color.WHITE);
				textService.enable(false);
				textService.setBackground(Color.LIGHT_GRAY);
			}
			
			else if(result == "Service"){
				tPrix.enable(false);
				tPrix.setBackground(Color.LIGHT_GRAY);
				textService.enable(true);
				textService.setBackground(Color.WHITE);
			}
			
			else {
				tPrix.enable(false);
				tPrix.setBackground(Color.LIGHT_GRAY);
				textService.enable(false);
				textService.setBackground(Color.LIGHT_GRAY);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Annuler")) {
			//Effacer les infos de la page
			this.dispose();
		}
		
		if(event.getActionCommand().equals("Deposer")) {
			//Ajouter l'annonce au panel
			this.dispose();
		}
	}
	
	
}

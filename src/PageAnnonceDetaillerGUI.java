import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageAnnonceDetaillerGUI extends JFrame {
	
	private JPanel container = new JPanel();
	
	protected JTextField tTitre = new JTextField(15);
	protected JTextField tPhoto = new JTextField(15);
	protected JTextArea textService = new JTextArea();
	protected JTextArea textDescription = new JTextArea();
	private JButton bContacter = new JButton("Contacter");
	
	
	// Constructor

	public PageAnnonceDetaillerGUI() {
		
		this.setSize(200, 300);  //size de la fenetre
		this.setTitle("Annonce"); //titre de la fenetre
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
	    
		tTitre.setText("Titre");
		container.add(tTitre);
		
		tPhoto.setText("Photo");
		container.add(tPhoto);
		
		textDescription.setText("Description");
		container.add(textDescription);
		
		textService.setText("Prix ou Service");
		container.add(textService);

		bContacter.addActionListener(new bContacterListener());
		container.add(bContacter);
	}
	
	//Classes ecoutant les Boutons	  
	public class bContacterListener implements ActionListener { 		// b1 bouton contacter
		public void actionPerformed(ActionEvent e1) {
			if((JButton)e1.getSource()==bContacter) {
			
			}
		}
	}
	
}

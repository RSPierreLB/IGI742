import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageAnnonceDetaillerGUI extends JFrame implements ActionListener {
	
	private JPanel container = new JPanel();
	
	protected JTextField tTitre = new JTextField(15);
	protected JTextField tPhoto = new JTextField(15);
	protected JTextArea textService = new JTextArea();
	protected JTextArea textDescription = new JTextArea();
	
	private JButton bouton_contacter = new JButton("Contacter");
	
	
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

		bouton_contacter.addActionListener(this);
		bouton_contacter.setActionCommand("Contacter");
		container.add(bouton_contacter);
	
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Contacter")) {
			
		}
	
	}
	
	
}

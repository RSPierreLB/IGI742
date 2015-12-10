import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PageConnecterGUI extends JFrame implements ActionListener {
	
	private JPanel container = new JPanel();

	private JPanel panBouton = new JPanel();
	private JButton bouton_recherche = new JButton("Recherche");
	private JButton bouton_deposer = new JButton("Déposer annonce");
	private JButton bouton_compte = new JButton("Mon compte");
	private JButton bouton_deconnexion = new JButton("Déconnexion");
	
	private JTextField tRecherche = new JTextField(10); //champ de recherche
	private String recherche;	//variable récupération recherche
	
	private JPanel panListeAnnonces = new JPanel();
	private DefaultListModel liste_des_annonces = new DefaultListModel();
	private JList listeAnnonces = new JList(liste_des_annonces);
	
	
	public PageConnecterGUI() {

		this.setSize(650, 500); 												//size de la fenetre
		this.setTitle("Application de partage sur le campus"); 					//titre de la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.AjoutElements(); 													//ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}

	
	private void AjoutElements() {
		
		// Creation des boutons
		bouton_recherche.setPreferredSize(new Dimension(100, 40)); 							//dimension du bouton1
		bouton_recherche.addActionListener(this);
		bouton_recherche.setActionCommand("Rechercher");
		
		bouton_deposer.setPreferredSize(new Dimension(130, 40)); 							//dimension du bouton2    
		bouton_deposer.addActionListener(this);
		bouton_deposer.setActionCommand("Deposer");
	    
	    bouton_compte.setPreferredSize(new Dimension(110, 40)); 							//dimension du bouton3    
	    bouton_compte.addActionListener(this);
	    bouton_compte.setActionCommand("Compte");
	    
	    bouton_deconnexion.setPreferredSize(new Dimension(120, 40)); 							//dimension du bouton4    
	    bouton_deconnexion.addActionListener(this);
	    bouton_deconnexion.setActionCommand("Deconnexion");

		panBouton.setLayout(new GridLayout(1, 4));
		panBouton.setBorder(new LineBorder(new Color(0, 0, 0)));
		panBouton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panBouton.setPreferredSize(new Dimension(630,50)); 						//size du panneau
		panBouton.setBackground(Color.RED); 									//couleur fond panneau bouton
		panBouton.add(bouton_recherche);
		panBouton.add(tRecherche); 												//Champ de recherche
		panBouton.add(bouton_deposer);
		panBouton.add(bouton_compte);
		panBouton.add(bouton_deconnexion);
	    
		
		// Affichage des annonces
	    listeAnnonces.setBackground(Color.WHITE);								//couleur du fond de la liste
	    listeAnnonces.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//selection que d'une seule ligne possible
	    listeAnnonces.setSize(520, 300); 										//size de la liste
	    listeAnnonces.addListSelectionListener(new listeAnnonceListener());
	    listeAnnonces.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
	    panListeAnnonces.setBorder(new LineBorder(new Color(0, 0, 0)));
	    panListeAnnonces.setPreferredSize(new Dimension(630,410)); 				//size du panneau
	    panListeAnnonces.add(listeAnnonces);
		

		//ajout tous les elements dans la fenetre
		//container.setLayout(new GridLayout(2, 1));
		container.add(panBouton);
		container.add(panListeAnnonces);
		
	}
	
	// Classes Listener
	public class listeAnnonceListener implements ListSelectionListener {		//Liste des annonces
		public void valueChanged(ListSelectionEvent l1) {
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("Deonnexion")) {
			//PageConnexionGUI pc = new PageConnexionGUI(); 
			
		}
		
		if(event.getActionCommand().equals("Rechercher")) {
			recherche = tRecherche.getText();									//récupérer les valeurs du champ 
		}
		
		if(event.getActionCommand().equals("Deposer")) {
			
		}
		
		if(event.getActionCommand().equals("Compte")) {
			
		}
	}
}
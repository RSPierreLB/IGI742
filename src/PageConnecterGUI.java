import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PageConnecterGUI extends JFrame {

	private JPanel container = new JPanel();

	private JPanel panBouton = new JPanel();
	private JButton b1 = new JButton("Recherche");
	private JButton b2 = new JButton("Déposer");
	private JButton b3 = new JButton("Mon compte");
	private JButton b4 = new JButton("Déconnexion");
	
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
		b1.setPreferredSize(new Dimension(150, 40)); 							//dimension du bouton1
		b1.addActionListener(new b1Listener());
		b2.setPreferredSize(new Dimension(150, 40)); 							//dimension du bouton2    
	    b2.addActionListener(new b2Listener());
	    b3.setPreferredSize(new Dimension(150, 40)); 							//dimension du bouton3    
	    b3.addActionListener(new b3Listener());
	    b4.setPreferredSize(new Dimension(150, 40)); 							//dimension du bouton4    
	    b4.addActionListener(new b4Listener());

		panBouton.setLayout(new GridLayout(1, 4));
		panBouton.setBorder(new LineBorder(new Color(0, 0, 0)));
		panBouton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panBouton.setPreferredSize(new Dimension(630,50)); 						//size du panneau
		panBouton.setBackground(Color.RED); 									//couleur fond panneau bouton
		panBouton.add(b1);
		panBouton.add(b2);
		panBouton.add(b3);
		panBouton.add(b4);
	    
		
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
	public class b1Listener implements ActionListener { 						//Bouton recherche
		public void actionPerformed(ActionEvent e1) {

		}
	}
	
	public class b2Listener implements ActionListener { 						//Bouton deposer
		public void actionPerformed(ActionEvent e2) {

		}
	}
	
	public class b3Listener implements ActionListener { 						//Bouton mon compte
		public void actionPerformed(ActionEvent e3) {

		}
	}
	
	public class b4Listener implements ActionListener { 						//Bouton deconnexion
		public void actionPerformed(ActionEvent e4) {

		}
	}

	public class listeAnnonceListener implements ListSelectionListener {		//Liste des annonces
		public void valueChanged(ListSelectionEvent l1) {
			
		}
	}
}
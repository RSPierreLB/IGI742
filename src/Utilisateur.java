
public class Utilisateur{
	private String prenom;
	private String nom;
		
	public Utilisateur(String prenom, String nom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
/*	createProfil()
	{
		
	}
	createAnnonce()
	{
		
	}
	consultAnnonce()
	{
		
	}*/
		
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}

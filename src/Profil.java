import java.util.*;

public class Profil extends Observable{

	
	private String prenom;
	private String nom;
	private String contact;
	private String pseudo;
	private String password;
	private String description;
	private String photo;
		
	public Profil(String prenom, String nom, String contact, String pseudo, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.contact = contact;
		this.pseudo = pseudo;
		this.password = password;
	}
	
	public Profil(String prenom, String nom, String contact, String pseudo, String password, String description, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.contact = contact;
		this.pseudo = pseudo;
		this.password = password;
		this.description = description;
		this.photo = photo;
	}

	
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
		setChanged();
		notifyObservers(this.pseudo);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Profil [pseudo=" + pseudo + "]";
	}
	
	
}

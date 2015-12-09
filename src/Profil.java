import java.util.*;

public class Profil extends Observable{
	
	private Utilisateur utilisateur;
	
	private String pseudo;
	private String password;
	private String description;
	private String photo;
		
	public Profil(Utilisateur utilisateur, String pseudo, String password) {
		super();
		this.utilisateur = utilisateur;
		this.pseudo = pseudo;
		this.password = password;
	}
	
	public Profil(Utilisateur utilisateur, String pseudo, String password,
			String description, String photo) {
		super();
		this.utilisateur = utilisateur;
		this.pseudo = pseudo;
		this.password = password;
		this.description = description;
		this.photo = photo;
	}

	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
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

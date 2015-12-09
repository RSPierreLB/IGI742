import java.text.SimpleDateFormat;
import java.util.*;

public class Annonce implements Observer{
	
	public Recherche recherche;
	
	private Profil profil;
	private String titre;
	private String prix;
	private String type;
	private String description;
	private String image;
	private String auteur;
	private String info;
	
	
	
	public Annonce(Profil profil, String titre, String prix, String type, String description) {
		super();
		this.profil= profil;
		this.titre = titre;
		this.prix = prix;
		this.type = type;
		this.description = description;
	}



	public Annonce(Profil profil, String titre, String prix, String type, String description,
			String image) {
		super();
		this.profil= profil;
		this.titre = titre;
		this.prix = prix;
		this.type = type;
		this.description = description;
		this.image = image;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getPrix() {
		return prix;
	}



	public void setPrix(String prix) {
		this.prix = prix;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}


	public String getAuteur() {
		return auteur;
	}



	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}



	public String getInfo() {
		return info;
	}



	public void setInfo(String info) {
		this.info = info;
	}



	public Profil getProfil() {
		return profil;
	}



	public void setProfil(Profil profil) {
		this.profil = profil;
	}



	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Profil)
		{
			Calendar c=new GregorianCalendar(Locale.FRANCE);
			Date d= c.getTime();
			setInfo("notif recu le "+ new SimpleDateFormat().format(d));
		}
	}



	@Override
	public String toString() {
		return "Annonce [info=" + info + "]";
	}
	
	
}

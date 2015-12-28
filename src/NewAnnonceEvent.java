import java.util.EventObject;

public class NewAnnonceEvent extends EventObject {
	Annonce uneAnnonce;
	
	
	// Constructor
	public NewAnnonceEvent(Object source, Annonce annonce) {
		super(source);
		this.uneAnnonce = annonce;
	}

	
	// Getters and Setters
	public Annonce getUneAnnonce() {
		return uneAnnonce;
	}

	public void setUneAnnonce(Annonce annonce) {
		this.uneAnnonce = annonce;
	}

}
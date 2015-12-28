import java.util.EventObject;

public class NewUserEvent extends EventObject{
	Utilisateur anUser;
	
	
	// Constructor
	public NewUserEvent(Object source, Utilisateur User) {
		super(source);
		this.anUser = User;
	}

	
	// Getters and Setters
	public Utilisateur getanUser() {
		return anUser;
	}

	public void setAnUser(Utilisateur User) {
		this.anUser = User;
	}

}
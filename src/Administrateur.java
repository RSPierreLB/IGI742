import java.text.SimpleDateFormat;
import java.util.*;

public class Administrateur extends Utilisateur implements Observer{
	
	private static Administrateur admin= null;
	private String info;
	
	private Administrateur(String prenom, String nom) {
		super(prenom, nom);
		// TODO Auto-generated constructor stub
	}
	
	public static Administrateur getInstance(){ 
		if(Administrateur.admin==null)	// protection multi thread
		{
			synchronized(Administrateur.class)
			{
				if(Administrateur.admin==null)
				{
					Administrateur.admin= new Administrateur("Admin", "Strateur");
				}
			}
		}
		return Administrateur.admin;
	}
	
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
		return "Administrateur [info=" + info + "]";
	}
	
	
}

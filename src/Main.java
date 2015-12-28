
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PageNonConnecterGUI pnc = new PageNonConnecterGUI();
		
		
		Administrateur admin= Administrateur.getInstance();
		
		Utilisateur u1= new Utilisateur("Lucas","Warnet");
		
		Profil p1= new Profil(u1, "pseudo", "password");
		
		Annonce a1 = new Annonce(p1,"titre", "prix", "type", "description");
		
		p1.addObserver(admin);
		p1.addObserver(a1);
		
		System.out.println(a1);
		
		p1.setPseudo("nouveau pseudo");
		
		
		System.out.println(a1);
		System.out.println(admin);
		
		System.out.println(p1.countObservers());
		
		p1.deleteObserver(a1);
		
		System.out.println(p1.countObservers());
		p1.setPseudo("nouveau");
		
		System.out.println(a1);
		System.out.println(admin);
		
		
	}
}

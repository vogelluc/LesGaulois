package personnages;

public class Gaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8); 
		System.out.println(asterix);
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le gaulois "+ nom + " : ";
	}


	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	} 
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
	    romain.recevoirCoup((force * effetPotion) / 3);
	    if (effetPotion > 1) {
	        effetPotion--;
	    }
		
	}
	
	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	}

}



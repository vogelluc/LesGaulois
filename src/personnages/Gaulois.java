package personnages;
import villagegaulois.Village;

public class Gaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8); 
		System.out.println(asterix);
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
    private villagegaulois.Village village;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;		
	}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
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

    public void setVillage(Village village) {
        this.village = village;
    }
    public Village getVillage() {
        return village;
    }
    public void sePresenter() {
        if (village == null) {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.\"");
        } else if (village.getChef() == this) {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je suis le chef le village " + village.getNom() + ".\"");
        } else {
            System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".\"");
        }
    }

}

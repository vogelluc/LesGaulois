package personnages;
import objets.Chaudron;


public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;
    
	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = new Chaudron(0,1);
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le Druide "+ nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
        chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}
	
	public void booster(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else if (chaudron.restePotion()) {
            int forcePotion = chaudron.prendreLouche();
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
            gaulois.boirePotion(forcePotion);
        } else {
            parler("Désolé " + gaulois.getNom() + " je n'ai plus de potion.");
        }
    }

	
	public String getNom() {
		return nom;
	}

	
	
	
	

	
	
}



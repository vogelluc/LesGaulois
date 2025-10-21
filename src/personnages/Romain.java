package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");		
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            parler("Aïe");
        } else {
            parler("J'abandonne !");
        }
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			ajouterEquipement(equipement);
			break;
		case 1:
			if (equipements[0] == equipement) {
				afficherSoldat("possède déjà un " + equipement + " !");
			} else {
				ajouterEquipement(equipement);
			}
			break;
		default:
			afficherSoldat("est déjà bien protégé !");
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		afficherSoldat("s'équipe avec un " + equipement + ".");
	}

	private void afficherSoldat(String message) {
		System.out.println("Le soldat " + nom + " " + message);
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}

}

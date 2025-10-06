package villagegaulois;
import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	
	public Village(String nom, int nbVillageois) {
		super();
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef = chef;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	

	
	
}

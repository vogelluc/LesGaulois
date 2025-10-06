package objets;

public class Chaudron{
    private int quantitePotion;
    private int forcePotion;
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
    public boolean restePotion() {
        return quantitePotion > 0;
    }

    public void remplirChaudron(int quantite, int forcePotion) {
        this.quantitePotion = quantite;
        this.forcePotion = forcePotion;
    	
    }
    
    public int prendreLouche() {
        if (quantitePotion > 0) {
            quantitePotion--;
            return forcePotion;
        } else {
            return 1; 
        }
    }
}



    



package villagegaulois;

import personnages.Gaulois;

public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, Gaulois chef, int nbVillageoisMax) {
        if (chef == null) {
            throw new IllegalArgumentException("Le chef du village ne peut pas être null.");
        }
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[nbVillageoisMax];
        chef.setVillage(this);
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (gaulois == null) return;
        if (nbVillageois >= villageois.length) {
            System.out.println("Le village est plein, impossible d'ajouter " + gaulois.getNom() + ".");
            return;
        }
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
        gaulois.setVillage(this);
    }

    public Gaulois trouverVillageois(int numero) {
        int index = numero - 1;
        if (index < 0 || index >= villageois.length || villageois[index] == null) {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
        return villageois[index];
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (Gaulois g : villageois) {
            if (g != null) {
                System.out.println("- " + g.getNom());
            }
        }
    }

    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);

        Gaulois gaulois = village.trouverVillageois(30);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();

        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);

        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
    }
}

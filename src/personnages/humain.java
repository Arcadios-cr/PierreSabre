package personnages;

public class humain {
    private String nom;
    private String boisson;
    private int argent;
    
    public humain(String nom, String boisson, int argent) {
        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public String getBoisson() {
    	return this.boisson;
    }
    
    
    public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public int getArgent() {
        return this.argent;
    }
    
    public void gagnerArgent(int gain) {
        this.argent += gain;
    }
    
    public void perdreArgent(int perte) {
        this.argent -= perte;
    }
    
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + getBoisson() + ".");
    }
    
    public void boire() {
        parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
    }
    
    public void acheter(String bien, int prix) {
        if (this.argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " +bien + " à " +prix + " sous.");
            perdreArgent(prix);
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
        }
    }
    
    protected void parler(String texte) {
        System.out.println("(" + this.nom + ") - " + texte);
    }


}

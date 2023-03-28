package personnages;

public class Commercant extends humain {
    
    public Commercant(String nom, int argent) {
        super(nom, "th�", argent);
    }
    
    public int seFaireExtorquer() {
        int argentPerdu = this.getArgent();
        parler("J'ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }
    
    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie g�n�reux donateur!");
    }
}

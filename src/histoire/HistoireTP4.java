package histoire;
import personnages.humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
        // humain prof = new humain("Prof", "kombucha", 54);
        // prof.direBonjour();
        // prof.acheter("boisson", 12);
        // prof.boire();
        // prof.acheter("jeu", 2);
        // prof.acheter("kimono", 50);
        
        // Commercant marco = new Commercant("Marco", 20);
        // marco.direBonjour();
        // marco.seFaireExtorquer();
        // marco.recevoir(15);
        // marco.boire();
        
    	Commercant marco = new Commercant("Marco", 15);
    	Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
    	yaku.direBonjour();
    	yaku.extorquer(marco);
    	marco.seFaireExtorquer();
    }
}

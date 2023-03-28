package histoire;
import personnages.humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

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
        
    	/*Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
    	yaku.direBonjour();
    	yaku.extorquer(marco);
    	marco.seFaireExtorquer();*/
    	Commercant marco = new Commercant("Marco", 15);
    	Ronin roro = new Ronin("Roro","shochu", 60);
    	roro.direBonjour();
    	roro.donner(marco);
    	int argent = roro.getArgent()/10;
    	marco.recevoir(argent);
    }
}

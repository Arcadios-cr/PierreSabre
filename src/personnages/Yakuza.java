package personnages;

public class Yakuza extends humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boisson, int argent, String clan) {
        super(nom, boisson, argent);
        this.clan = clan;
        this.reputation = 0;
    }
    
    public void extorquer(Commercant victime) {
        int argentVictime = victime.getArgent();
        gagnerArgent(argentVictime);
        victime.perdreArgent(argentVictime);
        reputation++;
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
        parler(victime.getNom() +", si tu tiens � la vie donne moi ta bourse !");
        parler("J'ai piqu� les " + argentVictime + " sous � " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
    }


}

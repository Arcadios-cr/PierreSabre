package personnages;

public class Ronin extends humain {
	    private int honneur;
	    private int argent;
	    
	    public Ronin(String nom, String boisson, int argent) {
	        super(nom, boisson, argent);
	        this.honneur = 1;
	        this.argent = argent;
	    }

	    public void donner(Commercant beneficiaire) {
	        int montant = (int) (argent*0.1); // 10% de l'argent du Ronin
	        argent -= montant;
	        beneficiaire.gagnerArgent(montant);
	        parler(beneficiaire.getNom()+" prend ces "+ montant+ " sous");
	    }
	}



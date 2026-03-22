package test_jeu;
import jeu.*;

public class Jeu {

	private int nbCoeurs = 5;
	private Pirate joueur1;
	private Pirate joueur2;
	private Affichage journal;
	private String nom1;
	private String nom2;

	public Jeu(Affichage journalPirate) {
		this.journal = journalPirate;
		
		Plateau plateau1 = new Plateau(journalPirate);
		Plateau plateau2 = new Plateau(journalPirate);
		
		nom1 = "Jack";
		nom2 = "Bill";
		creerPirate(nom1, nom2, plateau1, plateau2);
		
		journal.affichePirate(joueur1.getNom(), joueur1.getCouleur());
		journal.affichePirate(joueur2.getNom(), joueur2.getCouleur());
		
		
		jouer();
	}

	protected void creerPirate(String nom1, String nom2, Plateau plateau1, Plateau plateau2) {
		joueur1 = new Pirate(nom1, nbCoeurs, Couleur.ROUGE,  journal, plateau1);
		joueur2 = new Pirate(nom2, nbCoeurs, Couleur.BLEU,  journal, plateau2);
	}

	protected void jouer() {
		
		while (continuerPartie()) {
			
			journal.afficheTour(nom1);
			journal.afficheJoueurSuiv();
            joueur1.deplacer(joueur2);

            if (continuerPartie()) {
            	
    			journal.afficheTour(nom2);

            	journal.afficheJoueurSuiv();
                joueur2.deplacer(joueur1);
            }
		}
	}

	protected boolean continuerPartie() {
		return !joueur1.getVictoire() && !joueur2.getVictoire() && !joueur1.testestMort() && !joueur2.testestMort();
	}

}
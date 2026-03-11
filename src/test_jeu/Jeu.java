package test_jeu;

import jeu.*;

public class Jeu {

	private int nbCoeurs = 10;
	private Pirate joueur1;
	private Pirate joueur2;

	public Jeu(Affichage journalPirate, String nom1, String nom2) {

		Plateau plateau1 = new Plateau(journalPirate);
		Plateau plateau2 = new Plateau(journalPirate);
		
		joueur1 = new Pirate(nom1, nbCoeurs, Couleur.ROUGE,  journalPirate, plateau1);
		joueur2 = new Pirate(nom2, nbCoeurs, Couleur.BLEU,  journalPirate, plateau2);
		
		journalPirate.affichePirate(joueur1.getNom(), joueur1.getCouleur());
		journalPirate.affichePirate(joueur2.getNom(), joueur2.getCouleur());

		jouer();
	}

	protected void jouer() {
		while (!joueur1.getVictoire() && !joueur2.getVictoire() && !joueur1.testestMort() && !joueur2.testestMort()) {

            joueur1.deplacer(joueur2);

            if (!joueur1.getVictoire() && !joueur2.testestMort()) {
                joueur2.deplacer(joueur1);
            }
		}
	}

}
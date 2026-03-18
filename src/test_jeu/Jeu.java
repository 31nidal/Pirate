package test_jeu;

import jeu.*;

public class Jeu {

	private int nbCoeurs = 5;
	private Pirate joueur1;
	private Pirate joueur2;
	private Affichage journal;

	public Jeu(Affichage journalPirate, String nom1, String nom2) {

		this.journal = journalPirate;

		Plateau plateau1 = new Plateau(journalPirate);
		Plateau plateau2 = new Plateau(journalPirate);

		joueur1 = new Pirate(nom1, nbCoeurs, Couleur.ROUGE, journalPirate, plateau1);
		joueur2 = new Pirate(nom2, nbCoeurs, Couleur.BLEU, journalPirate, plateau2);

		journal.affichePirate(joueur1.getNom(), joueur1.getCouleur());
		journal.affichePirate(joueur2.getNom(), joueur2.getCouleur());

		jouer();
	}

	protected void jouer() {

		while (true) {

			System.out.println("\n--- Tour de " + joueur1.getNom() + " ---");
			joueur1.deplacer(joueur2);
			journal.afficheJoueurSuiv();

			if (joueur1.getVictoire() || joueur2.testestMort()) {
				journal.afficheVictoire(joueur1.getNom());
				break;
			}

			System.out.println("\n--- Tour de " + joueur2.getNom() + " ---");
			joueur2.deplacer(joueur1);
			journal.afficheJoueurSuiv();

			if (joueur2.getVictoire() || joueur1.testestMort()) {
				journal.afficheVictoire(joueur2.getNom());
				break;
			}
		}
	}
}
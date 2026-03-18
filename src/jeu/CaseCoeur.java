package jeu;

public class CaseCoeur extends Case {

	public CaseCoeur(int numero) {
		super(numero, CaseType.COEUR);

	}

	@Override
	public void actionCase(Pirate joueur, Pirate ennemi, Affichage journal) {

		if (joueur.getNbCoeur() < 5) {
			joueur.incNbCoeur();
			journal.afficheGainCoeurs(joueur.getNom());
		} else {
			journal.afficheImpossibleIncrCoeur(joueur.getNom(), joueur.getNbCoeur());
		}
	}
}

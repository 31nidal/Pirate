package jeu;

public class CaseFilet extends Case {

	public CaseFilet(int numero) {
		super(numero, CaseType.FILET);

	}

	@Override
	public void actionCase(Pirate joueur, Pirate ennemi, Affichage journal) {

		joueur.estBloquer();
		journal.afficheBloque(joueur.getNom());
	}

}

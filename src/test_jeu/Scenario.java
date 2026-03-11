package test_jeu;

import jeu.Affichage;
import jeu.JournalPirate;

public class Scenario {

	public static void main(String[] args) {
		Affichage journal = new JournalPirate();
		Jeu jeu = new Jeu(journal, "Jack", "Bill");
	}
}
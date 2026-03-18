package jeu;

import java.util.Scanner;

public class JournalPirate implements Affichage {
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void affichePirate(String nom, Couleur couleur) {
		System.out.println(
				"Bien le bonjour ! je suis " + nom + " le grand et je suis fière d'arpenter la couleur " + couleur);
	}

	@Override
	public void afficheDee(int value) {
		System.out.println("ARRrrr mon Dés est : " + value);
	}

	@Override
	public void afficheLanceDee(String nom) {
		System.out.println("\nAttention ! le grand " + nom + " lance le Dé !");
	}

	@Override
	public void afficheDeplacement(int nbcase) {
		System.out.println("Hissez ho ! J'avance de " + nbcase + " cases !");
	}

	@Override
	public void afficheVictoire(String nom) {
		System.out.println("OHÉ OHÉ moi le grand " + nom + " j'ai REUSSI CE JEU !");
	}

	@Override
	public void afficheRecule(int depassement, int nouvellePosition) {
		System.out.println("Mille sabords ! Je dépasse la fin de " + depassement + " cases !");
		System.out.println("Je recule et j'arrive maintenant en case " + nouvellePosition);
	}

	@Override
	public void afficheBloque(String nom) {
		System.out.println("Un filet ! Le grand " + nom + " est piégé pendant 1 tour !");
	}

	@Override
	public void afficheAttaque(String nom, Arme arme, int degats) {
		System.out.println("BOUM ! " + nom + " trouve un " + arme + " et inflige " + degats + " dégâts !");
	}

	@Override
	public void afficheMort(String nom) {
		System.out.println("Le grand " + nom + " sombre dans les abysses (IL EST MORT !)");
	}

	@Override
	public void affichePosition(String nom, int position) {
		System.out.println(nom + " est maintenant en case " + position);
	}

	@Override
	public void afficheCoeurs(String nom, int nbCoeur) {
		System.out.println(nom + " a maintenant " + nbCoeur + " coeurs restants !");
	}

	@Override
	public void afficheGainCoeurs(String nom) {
		System.out.println(nom + " gagne 1 coeur !");
	}

	@Override
	public void afficheImpossibleIncrCoeur(String nom, int nbCoeur) {
		System.out.println(nom + "a deja" + nbCoeur + " coeurs et ne peut pas en avoir plus!");
	}

	@Override
	public void afficheJoueurSuiv() {
		System.out.println("Appuie sur Entrée pour continuer...");
		scanner.nextLine();
	}

	@Override
	public void afficheCaseNormale() {
		System.out.println("Rien ne se passe ici, la mer est calme ! ");
	}

}
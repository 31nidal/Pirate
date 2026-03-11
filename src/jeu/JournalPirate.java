package jeu;

public class JournalPirate implements Affichage {

	@Override
	public void affichePirate(String nom, Couleur couleur) {
		System.out.println("Bien le bonjour ! je suis " + nom + " le grand et je suis fiére d'arpanté la couleur " + couleur);
	}

	@Override
	public void afficheDee(int value) {
		System.out.println("ARRrrr mon Dés est : " + value);

	}

	@Override
	public void afficheLanceDee(String nom) {
		System.out.println("\nAttention ! le grand " + nom + " lance le Dee ");
	}

	@Override
	public void afficheDeplacement(int nbcase) {
		System.out.println("Hissez ho ! Garder le cap !!");

	}

	@Override
	public void afficheVictoire(String nom) {
		System.out.println("OHÉ OHÉ moi le grand " + nom + " j'ai REUSI !");
	}

	@Override
	public void afficheRecule() {
		System.out.println("Mille sabords ! JE RECULE !!!");
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

}
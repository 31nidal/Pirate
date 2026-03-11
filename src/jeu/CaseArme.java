package jeu;

public class CaseArme extends Case{
	
	private Arme arme;

	
	public CaseArme(Arme arme, int numero) {
		super(numero, CaseType.ARME);
		this.arme = arme;
	}
	
	@Override
	public void actionCase(Pirate joueur, Pirate ennemi, Affichage journal) {
	    
		int degats = arme.getDegats();
	    ennemi.perteVie(degats);
	    journal.afficheAttaque(joueur.getNom(), arme, degats);

	    if (ennemi.testestMort()) {
	        journal.afficheMort(ennemi.getNom());
	    }
	}
	
	public Arme getArme() {
        return arme;
    }
	
}

package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Des {
	private int valeur;
	private Random random;
	private Affichage journal;
	
	public Des(Affichage journal) {
		this.journal = journal;
		try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e){
            e.printStackTrace();
        }
	}
	public void lancerDes(String nom) {
		journal.afficheLanceDee(nom);
		
		valeur = random.nextInt(2, 13);
		
		journal.afficheDee(valeur);
	}
	
	public int getValeur() {
		return valeur;
	}
}
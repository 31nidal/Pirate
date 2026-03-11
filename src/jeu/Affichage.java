package jeu;

public interface Affichage {
	public void affichePirate(String nom, Couleur couleur);
	public void afficheDee(int value);
	public void afficheLanceDee(String nom);
	public void afficheDeplacement(int nbcase);
	public void afficheVictoire(String nom);
	public void afficheRecule();
    public void afficheBloque(String nom);
    public void afficheAttaque(String nom, Arme arme, int degats);
    public void afficheMort(String nom);
}
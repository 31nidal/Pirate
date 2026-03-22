package jeu;

public interface Affichage {
	public void affichePirate(String nom, Couleur couleur);

	public void afficheDee(int value);

	public void afficheLanceDee(String nom);

	public void afficheDeplacement(int nbcase);

	public void afficheVictoire(String nom);

	public void afficheRecule(int depassement, int nouvellePosition);

	public void afficheBloque(String nom);

	public void afficheAttaque(String nom, Arme arme, int degats);

	public void afficheMort(String nom);

	public void affichePosition(String nom, int position);

	public void afficheCoeurs(String nom, int nbCoeur);

	public void afficheGainCoeurs(String nom);

	public void afficheImpossibleIncrCoeur(String nom, int nbCoeur);

	public void afficheJoueurSuiv();

	public void afficheCaseNormale();
	public void afficheTour(String nom);
}
package jeu;

public abstract class Case {
	private int numero;
	private CaseType type;

	protected Case(int numero, CaseType type) {
		this.numero = numero;
		this.type = type;
	}

	public int getNumero() {
		return numero;
	}

	public abstract void actionCase(Pirate joueur, Pirate ennemi, Affichage journal);

	public CaseType getType() {
		return type;
	}

}
package jeu;

public enum Arme {
    CANON(3),FUSIL(2), EPEE(1);

    private int degats;

    Arme(int degats) {
        this.degats = degats;
    }

    
    public int getDegats() {
        return degats;
    }
}
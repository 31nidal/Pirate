package jeu;

public class Plateau {
    private int positionPirate;
    private int nbCases = 30;
    private Case[] cases  = new Case[nbCases];
    private int surplus;
    
    
    
    public Plateau(Affichage journal) {
        for (int i = 0; i < nbCases; i++) {
            cases[i] = new CaseNormal(i + 1);  
            } 
        
        cases[7]  = new CaseArme(Arme.CANON, 8); 
        cases[12] = new CaseArme(Arme.EPEE,  13);
        cases[22] = new CaseArme(Arme.FUSIL, 23);
        

        cases[5]  = new CaseFilet(6);
        cases[15] = new CaseFilet(16);
        
        
        positionPirate = 0;
    }
    
    public void incrCase(int val) {
        positionPirate += val;
        
    }
 
    public void reculeCase() {
        surplus = positionPirate - cases.length;
        positionPirate = cases.length - surplus;
        
        }

    public int getPosition() {
        return positionPirate;
    }

    public int getNbCases() {
        return cases.length;
    }

    public Case getCase(int numero) {
        return cases[numero - 1];
    }

    public boolean estDerniereCase(int position) {
        return position == cases.length;  
    }
    
    
}
package fr.unilim.iut.spaceinvaders.moteurjeu;


public interface Jeu {

	public void evoluer(Commande commandeUser);

	public boolean etreFini();
}

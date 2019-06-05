package fr.unilim.iut.spaceinvaders.utils;

public class Dimension {
	public int longueur;
	public int hauteur;

	public Dimension(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public int longueur() {
		return this.longueur;
	}

	public int hauteur() {
		return this.hauteur;
	}

}

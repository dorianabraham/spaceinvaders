package fr.unilim.iut.spaceinvaders.moteurjeu;


public class Commande {


	public boolean gauche;
	public boolean droite;
	public boolean haut;
	public boolean bas;
	public boolean tir;

	public Commande()
	{
		
	}
	
	public Commande(Commande commandeACopier)
	{
		this.bas=commandeACopier.bas;
		this.haut=commandeACopier.haut;
		this.gauche=commandeACopier.gauche;
		this.droite=commandeACopier.droite;	
		this.tir=commandeACopier.tir;
	}
	
}

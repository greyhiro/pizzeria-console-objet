package fr.pizzeria.console;

public class Pizza {
	
	/*
	0 PEP Pépéroni 12.50
	1 MAR Margherita 14.00
	2 REIN La Reine 11.50
	3 FRO La 4 fromages 12.00
	4 CAN La cannibale 12.50
	5 SAV La savoyarde 13.00
	6 ORI L’orientale 13.50
*/
	
	String code;
	String nom;
	double prix;
	int id;
	static int compteur=1;
	
	public Pizza(String code, String nom, double prix) {
		super();	
		this.id=compteur++;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getId()
	{
		return this.id;
	}


}

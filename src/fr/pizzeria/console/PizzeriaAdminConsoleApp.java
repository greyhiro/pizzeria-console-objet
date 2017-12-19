package fr.pizzeria.console;


import java.util.Scanner;
import fr.pizzeria.console.Pizza;

public class PizzeriaAdminConsoleApp {

	/**
	 * @param args
	 */
	/*
	 * 0 PEP Pépéroni 12.50 1 MAR Margherita 14.00 2 REIN La Reine 11.50 3 FRO La 4
	 * fromages 12.00 4 CAN La cannibale 12.50 5 SAV La savoyarde 13.00 6 ORI
	 * L’orientale 13.50
	 */
	public static void main(String[] args) {
	
		
		Pizza[] p = new Pizza[50];
		p[0] = new Pizza("PEP", "Pépéroni", 12.50);
		p[1] = new Pizza("MAR", "Margherita", 14.00);
		p[2] = new Pizza("REIN", "Reine", 14.00);
		p[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		p[4] = new Pizza("CAN", "La cannibale", 12.50);
		p[5] = new Pizza("SAV", "La savoyarde", 13.00);
		p[6] = new Pizza("ORI", "L’orientale", 13.50);

		int choix = 0;
		int i;

		try (Scanner scan = new Scanner(System.in)) {
			while (choix != 99) {

				System.out.println("\n***************Bienvenue à la pizzeria********************************* \n");
				System.out.println("\n MENU \n");
				System.out.println("1 ->  Liste des Pizza" + "\n 2->  Ajout d'une nouvelle pizza"
						+ "\n 3->  Mise à jour d'une pizza " + "\n 4->  Suppression d'une pizza" + "\n 99-> QUITTER");

				choix = scan.nextInt();

				switch (choix) {
				case 1:

					System.out.println("\n***************LA CARTE********************************* \n");

					for (i = 0; i < p.length; i++) {
						if (p[i] != null) {
							System.out.println(p[i].getId() + " " + p[i].getCode() + " " + p[i].getNom() + " " + p[i].getPrix());
						}
					}
					System.out.println("compteur = " + i + " PIZZA");
					break;

				case 2:

					String code;
					String nom;
					double prix;
					System.out.println("\n***************AJOUTER PIZZA********************************* \n");

					System.out.println("\n***************Choisissez son Code********************************* \n");

					code = scan.next();

					System.out.println("\n***************Choisissez son Nom********************************* \n");

					nom = scan.next();

					System.out.println("\n***************Choisissez son Prix********************************* \n");

					prix = scan.nextDouble();
					
					for (i = 0; i < p.length; i++) {
						if (p[i] == null) {
							p[i] = new Pizza(code, nom, prix);
							break;
						}
					}
					System.out
							.println(p[i].getId() + " " + p[i].getCode() + " " + p[i].getNom() + " " + p[i].getPrix());


					break;

				case 3:
					
					String codepizz;
					System.out.println("\n***************choisissez une pizza a modifier par son code********************************* \n");
					System.out.println("\n***************LA CARTE********************************* \n");

					for (i = 0; i < p.length; i++) {
						if (p[i] != null) {
							System.out.println(p[i].getId() + " " + p[i].getCode() + " " + p[i].getNom() + " " + p[i].getPrix());
						}
					}
					System.out.println("compteur = " + i + " PIZZA au max dans cettee liste");
				
					codepizz = scan.next();
					
			

					System.out.println("\n***************Nouveau Code********************************* \n");

					code = scan.next();

					System.out.println("\n***************Nouveau Nom********************************* \n");

					nom = scan.next();

					System.out.println("\n***************Nouveau Prix********************************* \n");

					prix = scan.nextDouble();
					
					for(i=0; i<p.length; i++)
					{
					
						if ((p[i] != null)&&(p[i].getCode().equals(codepizz)) )
						{
							
							p[i]= new Pizza(code, nom, prix);
						}
						
					}
							
							break;
						
				case 4:
					String pizzSupr;
					System.out.println("\n***************choisissez une pizza a supprimer par son code********************************* \n");
					System.out.println("\n***************LA CARTE********************************* \n");

					for (i = 0; i < p.length; i++) {
						if (p[i] != null) {
							System.out.println(p[i].getId() + " " + p[i].getCode() + " " + p[i].getNom() + " " + p[i].getPrix());
						}
					}
					System.out.println("compteur = " + i + " PIZZA au max dans cerre liste");
					
					pizzSupr = scan.next();
					for(i=0; i<p.length; i++)
					{
					
						if ((p[i] != null)&&(p[i].getCode().equals(pizzSupr)))
						{
							
							p[i]= null;
						}
						
					
					}	
			
					
					break;
				case 99:
					System.out.println("Au revoir!!!!!");
					break;
				default:
					System.out.println("\n repond une valeur du menu \n");
					break;

				}

			}

		}

	}
}

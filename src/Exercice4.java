import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= new int[10];
		Scanner sc= new Scanner (System.in);
		int valeur =0;
		
		System.out.println("Menu : \n 1- Ajouter un nombre\n 2- Afficher les nombres\n 0- quitter");
		System.out.println("Menu : Quel est votre choix");
		String choix = sc.next();
		boolean isNumber = choix.matches("[0-9]?");	
		
		do {
			while (isNumber == false){
			System.out.println("Erreur, saisie incorrecte. Veuillez réessayer !");
			choix = sc.next();
			isNumber = choix.matches("[0-9]?");			
			}
		
			valeur = Integer.parseInt(choix);
		}
		while (valeur<0 || valeur>2);
		
		while (valeur !=0){
			switch (valeur) {
			case 1 :{
				System.out.println("quel est le nombre à ajouter ?");
				int nombre= sc.nextInt();
				System.out.println(nombre + "\t");
			}
				break;
			case 2 :{
				for (int i=0; i<array.length; i++){ 
					System.out.print(array[i] + "\t");
				}
			}
				break;
			default :{
				System.out.println("Au revoir !");
			}	
			}
			
		}
	sc.close();		
	}
}

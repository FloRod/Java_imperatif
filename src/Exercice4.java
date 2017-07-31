import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= new int[5];
		Scanner sc= new Scanner (System.in);
		int valeur =0, filling =-1; // valeur: lier au choix utilisateur; filling : critère de remplissage tableau
		
		//Affiche le menu et demande une saisie utilisateur
		System.out.println("Menu : \n 1- Ajouter un nombre\n 2- Afficher les nombres\n 0- quitter");
		System.out.println("Menu : Quel est votre choix");
		String choix = sc.next();
		
		//Vérification de la saisie : il faut que ce soit un nombre correspondant au menu => à généraliser à l'ensemble du code
		boolean isNumber = choix.matches("[0-9]?");	
		
		do {
			while (isNumber == false){
			System.out.println("Erreur, saisie incorrecte. Veuillez r�essayer !");
			choix = sc.next();
			isNumber = choix.matches("[0-9]?");			
			}
		
			valeur = Integer.parseInt(choix); //transformation en int
			System.out.println(valeur);
		}
		while ((valeur<0 || valeur>2) || (isNumber == false));
		
		while (valeur !=0){
			switch (valeur) {
			case 1 :{
				System.out.println("quel est le nombre � ajouter ?");
				int nombre= sc.nextInt();
				filling ++;
				
				// test limite tableau et allongement si néccessaire
				if (filling > array.length){
					int[] arrayCopy = new int[2*array.length];
					for (int i=0;i<array.length;i++){
						arrayCopy[i] = array[i];
						array = arrayCopy;
					}	
				} else {array[filling] = nombre;
				}
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
			System.out.println("Menu : \n 1- Ajouter un nombre\n 2- Afficher les nombres\n 0- quitter");
			System.out.println("Menu : Quel est votre choix");
			valeur= sc.nextInt();
		}
	sc.close();		
	}
}

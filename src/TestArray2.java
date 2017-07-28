
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int somme=0, index=0, compteur=0;
		float moyenne = 0f;
		
		for (int i=0; i<array.length; i++){
			somme +=array[i];
			if (array[i] == 15){
				index =i;
			}
		}
		moyenne = somme/array.length;
		System.out.println("La moyenne des éléments du tableau est " + moyenne);
		System.out.println("L'index de la valeur 15 est " + index + " autrement dit la position " + (index+1));
		
		for (int i=0; i<array.length; i++){
			for (int j=i; j<array.length; j++){
			if ((array[i] == array[j]) && (i !=j)){
				compteur ++;
			}
			}
		}
		System.out.println("Il y a " + compteur + " doublons dans le tableau");
	}
}


public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// affiche tous les éléments d'un tableau dans l'ordre
		System.out.println("Les éléments du tableau dans l'ordre :");
		for (int i=0; i<array.length; i++){ 
			System.out.print(array[i] + "\t");
		}
		
		// affiche tous les éléments d'un tableau dans l'ordre inverse
		System.out.println("\nLes éléments du tableau dans l'ordre inverse :");
		for (int i=array.length-1; i>=0; i--){
			System.out.print(array[i] + "\t");
		}
		
		// affiche tous les éléments d'un tableau supérieur à 3
		System.out.println("\nLes éléments du tableau supérieur à 3 :");
		for (int i=0; i<array.length; i++){ //affiche les éléments dans l'ordre
			if (array[i]>3){
			System.out.print(array[i] + "\t");
			}
		}
		
		// affiche tous les éléments paires d'un tableau
		System.out.println("\nLes éléments pairs du tableau :");
		for (int i=0; i<array.length; i++){
			if (array[i]%2 == 0){
			System.out.print(array[i] + "\t");
			}
		}
		
		// affiche l'éléments le plus grand et le plus petit d'un tableau
		int max=0, min=0;
		for (int i=0; i<array.length; i++){
			if (array[i] > max){
				max = array[i];
				}
				else if (min > array[i]){
					min =array[i];
					}
			}
			System.out.println("\nL'élément le plus grand du tableau est : " + max);
			System.out.println("L'élément le plus grand du tableau est : " + min);
	}
}

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = new int [array.length];
		int tampon = 0;
		
		//affichage du tableau original
		for (int i=0; i<array.length; i++){ 
			System.out.print(array[i] + "\t");
			array2 [i] = array[i];
		}
		
		// tri par insertion, méthode destructive
		for (int i=0; i<array.length; i++){
			for (int j=i; j<array.length; j++){
				if (array[j] < array[i]){
					tampon = array[i];
					array[i]=array[j];
					array[j]=tampon;
					}
			}
		}
		
		//affichage du tableau trié
		System.out.println("\nLe tableau 1 trié est le suivant: ");
		for (int i=0; i<array.length; i++){ 
			System.out.print(array[i] + "\t");
		}
		
		//tri avec la méthode sort
		Arrays.sort(array2);
		
		System.out.println("\nLe tableau 2 trié est le suivant: ");
		for (int i=0; i<array2.length; i++){ 
			System.out.print(array2[i] + "\t");
		}
		
	}

}

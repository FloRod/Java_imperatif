
public class TestArrayTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int tampon = 0;
		
		//affichage du tableau original
		for (int i=0; i<array.length; i++){ 
			System.out.print(array[i] + "\t");
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
		System.out.println("\nLe tableau trié est le suivant: ");
		for (int i=0; i<array.length; i++){ 
			System.out.print(array[i] + "\t");
		}
	}

}

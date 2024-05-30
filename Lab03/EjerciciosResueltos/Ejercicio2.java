import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println(multiplicaArrayDyV(0, array.length-1, array));
	}
	public static int multiplicaArrayDyV(int inicio, int fin, int[] array){
		if(inicio == fin){
			return array[inicio];
		}else{
			int mitad = (inicio+fin)/2;
			int x = multiplicaArrayDyV(inicio, mitad, array);
			int y = multiplicaArrayDyV(mitad+1, fin, array);
			return x * y;
		}
	}
}
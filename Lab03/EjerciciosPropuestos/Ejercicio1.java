import java.util.*;
public class Ejercicio1{
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 9};

		// Este primer caso deberia returnar falso porque son diferentes en el ultimo elemento
		System.out.print("array es igual a array1: ");
		System.out.println(arrayIguales(0, array.length-1, array, array1));
		// Este caso retornara igual, ya que son exactamente el mismo array
		System.out.print("array es igual a array: ");
		System.out.println(arrayIguales(0, array.length-1, array, array));
	}
	public static boolean arrayIguales(int inicio, int fin, int[] array, int [] array1){
		if(array.length != array1.length)
			return false;			// Si son de difente tamaño automaticamente son diferentes
		else if (inicio == fin){
			return array[inicio] == array1[inicio];
		}else{
			int mitad = (inicio+fin)/2;
			boolean x = arrayIguales(inicio, mitad, array, array1);
			boolean y = arrayIguales(mitad+1, fin, array, array1);
			return x && y;		// Ambos deben ser iguales en todo momento
		}
	}
}
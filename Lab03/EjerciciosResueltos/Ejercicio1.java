import java.util.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println(sumaArrayDyV(0, array.length-1, array));
	}
	public static int sumaArrayDyV(int inicio, int fin, int[] array){
		if(inicio == fin){
			return array[inicio];
		}else{
			int mitad = (inicio+fin)/2;
			int x = sumaArrayDyV(inicio, mitad, array);
			int y = sumaArrayDyV(mitad+1, fin, array);
			System.out.println(x * y); // Para ver como funciona
			return x + y;
		}
	}
}
import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		int[] array = {11, 20, 78, 48, 5, 61, 7, 8};
		
		System.out.print("Maximo elemento de array: ");
		System.out.println(maximoElemento(0, array.length-1, array));
		System.out.print("Minimo elemento de array: ");
		System.out.println(minimoElemento(0, array.length-1, array));
	}
	public static int maximoElemento(int inicio, int fin, int[] array){
		if(inicio == fin){
			return array[inicio];
		}else{
			int mitad = (inicio+fin)/2;
			int x = maximoElemento(inicio, mitad, array);
			int y = maximoElemento(mitad+1, fin, array);
			if(x > y)
				return x;
			else
				return y;
		}
	}
	public static int minimoElemento(int inicio, int fin, int[] array){
		if(inicio == fin){
			return array[inicio];
		}else{
			int mitad = (inicio+fin)/2;
			int x = minimoElemento(inicio, mitad, array);
			int y = minimoElemento(mitad+1, fin, array);
			if(x <= y)
				return x;
			else
				return y;
		}
	}
}
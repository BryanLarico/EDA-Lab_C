import java.util.*;
public class Ejercicio2{
	public static void main(String[] args){
		int [] array1 = {1,34,45,65,67,93,99};
		int [] array2 = {123,94,54,45,34,22,3};
		System.out.print(" arreglo1 = ");
		mostrarArreglo(array1);
		System.out.println(" arrglo1 es creciente?: " + esCreciente(array1));
		System.out.println(" arrglo1 es decreciente?: " + esDecreciente(array1));
		System.out.print(" arreglo2 = ");
		mostrarArreglo(array2);
		System.out.println(" arrglo2 es creciente?: " + esCreciente(array2));
		System.out.println(" arrglo2 es decreciente?: " + esDecreciente(array2));
	}
	public static boolean esCreciente(int [] arr){
		if(arr.length == 1)	// Caso base, si se llega hasta
			return true;			//aqui es porque si es creciente
		if(arr[0] <= arr[1])
			return esCreciente(arrayMenor(arr, 1, arr.length - 1));
		return false;
	}
	public static boolean esDecreciente(int [] arr){
		if(arr.length == 1) // Metodo recursivo tambien
			return true;
		if(arr[0] >= arr[1])
			return esDecreciente(arrayMenor(arr, 1, arr.length - 1));
		return false;
	}
	public static int [] arrayMenor(int [] arr, int inicio, int fin){
		int [] arrNew = new int[fin - inicio + 1];
		for(int i = 0; i < arrNew.length; i++)
			arrNew[i] = arr[inicio + i];
		return arrNew;
	}
	public static void mostrarArreglo(int [] lista){
		System.out.print("{");
		for(int i = 0; i < lista.length; i++){
			System.out.print(lista[i]);
			if(i + 1 < lista.length)
				System.out.print(", ");
		}
		System.out.println("}");
	}
}
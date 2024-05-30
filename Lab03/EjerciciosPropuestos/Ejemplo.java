import java.util.*;
public class Ejemplo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arreglo = {2, 5, 6, 9, 12, 13, 18, 27, 29, 49};
		System.out.print("Introduce el numero que deseas buscar: ");
		int objetivo = sc.nextInt();
		int resultado = busquedaBinariaDV(arreglo, 0, arreglo.length - 1, objetivo);
		if (resultado == -1) {
			System.out.println("El elemento no está presente en el arreglo");
		} else {
			System.out.println("El elemento está presente en el índice: " + resultado);
		}
  }
	
	public static int busquedaBinariaDV(int[] arr, int inicio, int fin, int objetivo) {
		if (inicio > fin) {
				return -1;
		}
		int medio = inicio + (fin - inicio) / 2;
		if (arr[medio] == objetivo) {
				return medio;
		} else if (arr[medio] > objetivo) {
				return busquedaBinariaDV(arr, inicio, medio - 1, objetivo);
		} else {
				return busquedaBinariaDV(arr, medio + 1, fin, objetivo);
		}
	}
}
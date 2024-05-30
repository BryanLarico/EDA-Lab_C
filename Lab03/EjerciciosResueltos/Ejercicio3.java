import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		double[] array = {1, 2, 3, 4, 5, 6};
		System.out.println(mediaArrayDyV(0, array.length-1, array, array.length));
	}
	public static double mediaArrayDyV(int inicio, int fin, double[] array, int longitud){
		if(inicio == fin){
			return array[inicio] / longitud;
		}else{
			int mitad = (inicio+fin)/2;
			double x = mediaArrayDyV(inicio, mitad, array, longitud);
			double y = mediaArrayDyV(mitad+1, fin, array, longitud);
			return x + y;
		}
	}
}
import java.util.*;
public class Ejercicio4{
	public static void main(String[] args){
		int numeroDiscos = 3;
		char recurso = 'A';
		char destino = 'C';
		char aux = 'B';
		MoverTorre(numeroDiscos, recurso, destino, aux);
	}
	public static void MoverTorre(int n, char r, char d, char aux) {
		if (n > 0) {
			MoverTorre(n - 1, r, aux, d);
			MoverDisco(n, r, d);
			MoverTorre(n - 1, aux, d, r);
		}
	}
	public static void MoverDisco(int disco, char r, char d) {
		System.out.println("Mover disco " + disco + " de " + r + " a " + d);
	}
}
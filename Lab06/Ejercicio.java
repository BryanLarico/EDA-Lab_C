import java.util.*;
public class Ejercicio{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Novela novela = new Novela("Cien Años de Soledad", "Gabriel Garcia Marques", "Ciencia Ficcion");
		LibroTextoUNSA libro = new LibroTextoUNSA("Fundamentos de la Programacion", "Marco Aedo", "FP2", "Produccion y Servicios");
		System.out.println(novela + "\n");
		System.out.println(libro);
	}
}
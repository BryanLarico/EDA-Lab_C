import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean agregarOtroTurista = true;
		while (agregarOtroTurista) {
			System.out.println("Ingrese el nombre del turista:");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese el documento de identidad del turista:");
			String documentoIdentidad = scanner.nextLine();
			Turista turista = new Turista(nombre, documentoIdentidad);
			System.out.println("\nRegistro completado. Información del turista:");
			turista.mostrarInformacion();
			System.out.println("\n¿Desea agregar otro turista? (s/n)");
			String respuesta = scanner.nextLine().toLowerCase();
			if (!respuesta.equals("s")) {
				agregarOtroTurista = false;
			}
		}
  }
}
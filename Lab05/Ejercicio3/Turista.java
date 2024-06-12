import java.util.Scanner;

public class Turista {
	private String nombre;
	private String documentoIdentidad;

	public Turista(String nombre, String documentoIdentidad) {
		this.nombre = nombre;
		this.documentoIdentidad = documentoIdentidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Documento de Identidad: " + documentoIdentidad);
	}
}
import java.util.*;

public class FavorecerPropiedades {
	
	static class Propiedad {
		String nombre;
		int[] contribuciones;
		public Propiedad(String nombre, int[] contribuciones) {
			this.nombre = nombre;
			this.contribuciones = contribuciones;
		}
	}

	static class SolucionParcial {
		List<Propiedad> propiedades;
		int[] sumaContribuciones;

		public SolucionParcial() {
			this.propiedades = new ArrayList<>();
			this.sumaContribuciones = new int[5]; // 5 riesgos
		}
	}
	
	// Del Ejercicio
	public static SolucionParcial getSolucionParcialCasoBase(List<Propiedad> propiedades, int maxPropAFavorecer) {
		SolucionParcial solucion = new SolucionParcial();
		for (int i = 0; i < Math.min(maxPropAFavorecer, propiedades.size()); i++) {
				solucion.propiedades.add(propiedades.get(i));
		}
		return solucion;
	}
	
	// Del Ejercicio
	public static SolucionParcial getSolucionParcialPorAlternativa(SolucionParcial solucion, Propiedad propiedad, int sumaMaxPorRiesgo) {
		SolucionParcial nuevaSolucion = new SolucionParcial();
		nuevaSolucion.propiedades.addAll(solucion.propiedades);
		nuevaSolucion.propiedades.add(propiedad);

		for (int i = 0; i < 5; i++) { // 5 riesgos
				nuevaSolucion.sumaContribuciones[i] = solucion.sumaContribuciones[i] + propiedad.contribuciones[i];
		}

		return nuevaSolucion;
	}
	
	// Del Ejercicio
	public static SolucionParcial getSolucionReconstruidaCasoRecursivo(List<Propiedad> propiedades, int maxPropAFavorecer, int sumaMaxPorRiesgo) {
		return getSolucionReconstruidaCasoRecursivo(propiedades, maxPropAFavorecer, sumaMaxPorRiesgo, 0);
	}

	private static SolucionParcial getSolucionReconstruidaCasoRecursivo(List<Propiedad> propiedades, int maxPropAFavorecer, int sumaMaxPorRiesgo, int indice) {
		if (indice >= propiedades.size() || maxPropAFavorecer == 0) {
			return new SolucionParcial();
		}

		Propiedad propiedadActual = propiedades.get(indice);
		SolucionParcial solucionSinPropiedad = getSolucionReconstruidaCasoRecursivo(propiedades, maxPropAFavorecer, sumaMaxPorRiesgo, indice + 1);
		SolucionParcial solucionConPropiedad = null;
		if (maxPropAFavorecer > 0) {
			solucionConPropiedad = getSolucionParcialPorAlternativa(solucionSinPropiedad, propiedadActual, sumaMaxPorRiesgo);
			maxPropAFavorecer--;
		}
		if (solucionConPropiedad == null || esSolucionMejor(solucionSinPropiedad, solucionConPropiedad, sumaMaxPorRiesgo))
			return solucionSinPropiedad;
		else
			return solucionConPropiedad;
	}

	private static boolean esSolucionMejor(SolucionParcial solucion1, SolucionParcial solucion2, int sumaMaxPorRiesgo) {
		for (int i = 0; i < 5; i++) { // 5 riesgos
			if (Math.abs(solucion1.sumaContribuciones[i]) > sumaMaxPorRiesgo || Math.abs(solucion2.sumaContribuciones[i]) > sumaMaxPorRiesgo) {
				return false; // No cumple la restricción de sumaMaxPorRiesgo
			}
		}
		int sumaCS1 = Arrays.stream(solucion1.sumaContribuciones).sum();
		int sumaCS2 = Arrays.stream(solucion2.sumaContribuciones).sum();
		return sumaCS1 > sumaCS2;
	}
}

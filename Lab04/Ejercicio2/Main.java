import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<FavorecerPropiedades.Propiedad> propiedades = new ArrayList<>();
		propiedades.add(new FavorecerPropiedades.Propiedad("ConocimientosEquipo", new int[]{-1, 1, -1, -1, 0}));
		propiedades.add(new FavorecerPropiedades.Propiedad("Plazo", new int[]{-1, 1, 0, 0, -1}));
		propiedades.add(new FavorecerPropiedades.Propiedad("RecursosParaCalidad", new int[]{-1, 0, -1, -1, 0}));
		// Agregar las demás propiedades según la tabla

		int maxPropAFavorecer = 4;
		int sumaMaxPorRiesgo = 2;

		FavorecerPropiedades.SolucionParcial solucion = FavorecerPropiedades.getSolucionReconstruidaCasoRecursivo(propiedades, maxPropAFavorecer, sumaMaxPorRiesgo);
		System.out.println("Propiedades favorecidas en la solución óptima:");
		for (FavorecerPropiedades.Propiedad propiedad : solucion.propiedades)
				System.out.println(propiedad.nombre);
		System.out.println("Suma de contribuciones por riesgo: " + Arrays.toString(solucion.sumaContribuciones));
	}
}

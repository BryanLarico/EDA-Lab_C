import java.util.*;
public class ProblemaSaltosPDR{

	public static int minimoSaltosParaLlegar(ArrayList<Integer> ciudadesNormal, int ciudadActual) {
		if (ciudadActual >= ciudadesNormal.size() - 1) {
			// Si estamos en la última ciudad o más allá, no se necesitan saltos
			return 0;
		}
		if (ciudadesNormal.get(ciudadActual) == 0) {
			// Si llegamos a una ciudad que nos lleva al mundo del revés, no podemos avanzar
			return Integer.MAX_VALUE;
		}
		int saltosNecesarios = Integer.MAX_VALUE;
		for (int i = 1; i <= ciudadesNormal.get(ciudadActual); i++) {
			int saltosDesdeAqui = minimoSaltosParaLlegar(ciudadesNormal, ciudadActual + i);
			if (saltosDesdeAqui != Integer.MAX_VALUE) {
				saltosNecesarios = Math.min(saltosNecesarios, 1 + saltosDesdeAqui);
			}
		}
		return saltosNecesarios;
	}
}
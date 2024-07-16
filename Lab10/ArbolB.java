import java.util.*;

public class ArbolB { 
    NodoB raiz; 
    int t; // Grado mínimo 
 
    public ArbolB(int t) { 
        this.raiz = null; 
        this.t = t; 
    } 
 
    // Función para buscar una llave en el árbol 
    public NodoB buscar(int k) { 
        return (raiz == null) ? null : buscarRecursivo(raiz, k); 
    } 
 
    private NodoB buscarRecursivo(NodoB nodo, int k) { 
        int i = 0; 
        while (i < nodo.llaves.size() && k > nodo.llaves.get(i)) { 
            i++; 
				} 
        if (i < nodo.llaves.size() && k == nodo.llaves.get(i)) { 
            return nodo; 
        } 
        return (nodo.hoja) ? null : buscarRecursivo(nodo.hijos.get(i), k); 
    } 
 
    // Función para insertar una llave en el árbol B 
    public void insertar(int k) { 
        if (raiz == null) { 
            raiz = new NodoB(t, true); 
            raiz.llaves.add(k); 
        } else { 
            if (raiz.llaves.size() == 2 * t - 1) { 
                NodoB s = new NodoB(t, false); 
                s.hijos.add(raiz); 
                dividirHijo(s, 0, raiz); 
                insertarNoLleno(s, k); 
                raiz = s; 
            } else { 
                insertarNoLleno(raiz, k); 
            } 
        } 
    } 
 
    private void insertarNoLleno(NodoB nodo, int k) { 
        int i = nodo.llaves.size() - 1; 
        if (nodo.hoja) { 
            nodo.llaves.add(0); 
            while (i >= 0 && nodo.llaves.get(i) > k) { 
                nodo.llaves.set(i + 1, nodo.llaves.get(i)); 
                i--; 
            } 
            nodo.llaves.set(i + 1, k); 
        } else { 
            while (i >= 0 && nodo.llaves.get(i) > k) { 
                i--; 
            } 
            i++; 
            if (nodo.hijos.get(i).llaves.size() == 2 * t - 1) { 
                dividirHijo(nodo, i, nodo.hijos.get(i)); 
                if (nodo.llaves.get(i) < k) { 
                    i++; 
                } 
            } 
            insertarNoLleno(nodo.hijos.get(i), k); 
        } 
    } 
 
    private void dividirHijo(NodoB nodo, int i, NodoB y) {
			 NodoB z = new NodoB(t, y.hoja); 
        for (int j = 0; j < t - 1; j++) { 
            z.llaves.add(y.llaves.remove(t)); 
        } 
        if (!y.hoja) { 
            for (int j = 0; j < t; j++) { 
                z.hijos.add(y.hijos.remove(t)); 
            } 
        } 
        nodo.hijos.add(i + 1, z); 
        nodo.llaves.add(i, y.llaves.remove(t - 1)); 
    } 
 
    // Función para imprimir el árbol B (uso de prueba) 
    public void imprimir() { 
        imprimirRecursivo(raiz, 0); 
    } 
 
    private void imprimirRecursivo(NodoB nodo, int nivel) { 
        if (nodo != null) { 
            System.out.println("Nivel " + nivel + " " + nodo.llaves); 
            for (NodoB hijo : nodo.hijos) { 
                imprimirRecursivo(hijo, nivel + 1); 
            } 
        }
		}
	public boolean esArbolBValido() {
		if (raiz == null) {
			return true;
		}
		return esArbolBValidoRecursivo(raiz, null, null);
	}

  private boolean esArbolBValidoRecursivo(NodoB nodo, Integer min, Integer max) {
		if (nodo.llaves.size() < t - 1 || nodo.llaves.size() > 2 * t - 1) {
			return false;
		}
		for (int i = 0; i < nodo.llaves.size() - 1; i++) {
			if (nodo.llaves.get(i) >= nodo.llaves.get(i + 1)) {
				return false;
			}
		}
		if (min != null && nodo.llaves.get(0) <= min) {
			return false;
		}
		if (max != null && nodo.llaves.get(nodo.llaves.size() - 1) >= max) {
			return false;
		}
		if (!nodo.hoja) {
			for (int i = 0; i <= nodo.llaves.size(); i++) {
				Integer newMax = (i == nodo.llaves.size()) ? max : nodo.llaves.get(i);
				Integer newMin = (i == 0) ? min : nodo.llaves.get(i - 1);
				if (!esArbolBValidoRecursivo(nodo.hijos.get(i), newMin, newMax)) {
					return false;
				}
			}
		}
		return true;
	}
	public void fusionar(ArbolB otro) {
		if (this.raiz == null) {
			this.raiz = otro.raiz;
		} else if (otro.raiz != null) {
			ArrayList<Integer> todasLlaves = new ArrayList<>();
			obtenerLlaves(this.raiz, todasLlaves);
			obtenerLlaves(otro.raiz, todasLlaves);
			Collections.sort(todasLlaves);
			this.raiz = null;
			for (int llave : todasLlaves) {
				this.insertar(llave);
			}
		}
	}

	private void obtenerLlaves(NodoB nodo, ArrayList<Integer> llaves) {
		if (nodo != null) {
			llaves.addAll(nodo.llaves);
			for (NodoB hijo : nodo.hijos) {
				obtenerLlaves(hijo, llaves);
			}
		}
	}
	
  public List<Integer> recorridoEnOrden() {
		List<Integer> resultado = new ArrayList<>();
		recorridoEnOrdenRecursivo(raiz, resultado);
		return resultado;
	}

	private void recorridoEnOrdenRecursivo(NodoB nodo, List<Integer> resultado) {
		if (nodo != null) {
			for (int i = 0; i < nodo.llaves.size(); i++) {
				if (!nodo.hoja) {
					recorridoEnOrdenRecursivo(nodo.hijos.get(i), resultado);
				}
				resultado.add(nodo.llaves.get(i));
			}
			if (!nodo.hoja) {
				recorridoEnOrdenRecursivo(nodo.hijos.get(nodo.llaves.size()), resultado);
			}
		}
	}

	public List<Integer> recorridoPreOrden() {
		List<Integer> resultado = new ArrayList<>();
		recorridoPreOrdenRecursivo(raiz, resultado);
		return resultado;
	}

	private void recorridoPreOrdenRecursivo(NodoB nodo, List<Integer> resultado) {
		if (nodo != null) {
			for (int i = 0; i < nodo.llaves.size(); i++) {
				resultado.add(nodo.llaves.get(i));
			}
			for (int i = 0; i <= nodo.llaves.size(); i++) {
				if (!nodo.hoja) {
					recorridoPreOrdenRecursivo(nodo.hijos.get(i), resultado);
				}
			}
		}
	}

	public List<Integer> recorridoPostOrden() {
		List<Integer> resultado = new ArrayList<>();
		recorridoPostOrdenRecursivo(raiz, resultado);
		return resultado;
	}

	private void recorridoPostOrdenRecursivo(NodoB nodo, List<Integer> resultado) {
		if (nodo != null) {
			for (int i = 0; i <= nodo.llaves.size(); i++) {
				if (!nodo.hoja) {
						recorridoPostOrdenRecursivo(nodo.hijos.get(i), resultado);
				}
			}
			for (int i = 0; i < nodo.llaves.size(); i++) {
				resultado.add(nodo.llaves.get(i));
			}
		}
	}
}
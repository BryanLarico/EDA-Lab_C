public class ArbolBinario {
	private Nodo raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public void insertar(int valor) {
		raiz = insertarRecursivo(raiz, valor);
	}

	public Nodo insertarRecursivo(Nodo nodo, int valor) {
		if (nodo == null) {
			nodo = new Nodo(valor);
			return nodo;
		}

		if (valor < nodo.getValor())
			nodo.setIzquierda(insertarRecursivo(nodo.getIzquierda(), valor));
		else if (valor > nodo.getValor())
			nodo.setDerecha(insertarRecursivo(nodo.getDerecha(), valor));
		return nodo;
	}

	public void recorrerEnOrden() {
		recorrerEnOrden(raiz);
	}

	public void recorrerEnOrden(Nodo nodo) {
		if (nodo != null) {
			recorrerEnOrden(nodo.getIzquierda());
			System.out.println(nodo.getValor());
			recorrerEnOrden(nodo.getDerecha());
		}
	}
}
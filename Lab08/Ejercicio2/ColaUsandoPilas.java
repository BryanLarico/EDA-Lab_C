public class ColaUsandoPilas {
	private Pila pila1;
	private Pila pila2;

	public ColaUsandoPilas() {
		pila1 = new Pila();
		pila2 = new Pila();
	}

	public void encolar(char elemento) {
		pila1.push(elemento);
		System.out.println("Encolado: " + elemento);
	}

	public char desencolar() {
		if (pila2.isEmpty()) {
			while (!pila1.isEmpty())
				pila2.push(pila1.pop());
		}
		if (pila2.isEmpty())
			throw new RuntimeException("Desencolar de una cola vacía");
		return pila2.pop();
	}
}
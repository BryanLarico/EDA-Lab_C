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

}
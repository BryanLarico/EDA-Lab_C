public class Main{
	public static void main(String[] args) {
		ColaUsandoPilas cola = new ColaUsandoPilas();
		cola.encolar('1');
		cola.encolar('2');
		cola.encolar('3');

		System.out.println("Desencolado: " + cola.desencolar());
		System.out.println("Desencolado: " + cola.desencolar());
		cola.encolar('4');
		System.out.println("Desencolado: " + cola.desencolar());
		System.out.println("Desencolado: " + cola.desencolar());
	}
}
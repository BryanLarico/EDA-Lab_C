public class MainPila { 
	public static void main(String[] args) { 
		Pila pila = new Pila(); 
		/*
		pila.push("H"); 
		pila.push("o"); 
		pila.push("l");
		pila.push("a");
		pila.mostrar();
		*/
		pila = pila.palabraComoPila("Hola");
		pila.mostrar();
		System.out.println(pila);
	}
} 
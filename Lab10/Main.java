public class Main{	
	public static void main(String[] args) { 
		ArbolB arbol = new ArbolB(3); 

		arbol.insertar(10); 
		arbol.insertar(20); 
		arbol.insertar(5); 
		arbol.insertar(6); 
		arbol.insertar(12); 
		arbol.insertar(30); 
		arbol.insertar(7); 
		arbol.insertar(17); 

		System.out.println("El árbol B es: "); 
		arbol.imprimir(); 
	} 
}	
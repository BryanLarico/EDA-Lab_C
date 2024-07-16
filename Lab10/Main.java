public class Main{	
	public static void main(String[] args) { 
		ArbolB arbol1 = new ArbolB(3); 
		arbol1.insertar(10); 
		arbol1.insertar(20); 
		arbol1.insertar(5); 
		arbol1.insertar(6); 

		ArbolB arbol2 = new ArbolB(3); 
		arbol2.insertar(12); 
		arbol2.insertar(30); 
		arbol2.insertar(7); 
		arbol2.insertar(17); 

		System.out.println("El árbol B1 es:"); 
		arbol1.imprimir(); 

		System.out.println("El árbol B2 es:"); 
		arbol2.imprimir(); 

		arbol1.fusionar(arbol2);

		System.out.println("El árbol B fusionado es:"); 
		arbol1.imprimir(); 
	} 
}
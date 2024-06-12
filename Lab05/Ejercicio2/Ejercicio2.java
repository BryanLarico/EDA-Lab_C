import java.util.*;
public class Ejercicio2{
	public static void main(String[] args) {
		ArbolBinario arbol = new ArbolBinario();

		arbol.insertar(50);
		arbol.insertar(30);
		arbol.insertar(70);
		arbol.insertar(20);
		arbol.insertar(40);
		arbol.insertar(80);
		arbol.insertar(60);
		
		System.out.println("Recorrido en orden del árbol:");
		arbol.recorrerEnOrden();
	}
}
import java.util.EmptyStackException; 
 
class Pila { 
	private Nodo top; 

	private static class Nodo { 
		char data; 
		Nodo next; 

		Nodo(char data) { 
			this.data = data; 
			this.next = null; 
		} 
	} 

	// Método para empujar (push) un elemento en la pila 
	public void push(char data) { 
		Nodo nuevoNodo = new Nodo(data); 
		nuevoNodo.next = top; 
		top = nuevoNodo; 
	} 

	// Método para sacar (pop) un elemento de la pila 
	public char pop() { 
		if (top == null) { 
			throw new EmptyStackException(); 
		} 
		char data = top.data; 
		top = top.next; 
		return data; 
	} 

	// Método para ver el elemento en la cima de la pila 
	public char peek() { 
		if (top == null) { 
			throw new EmptyStackException(); 
		} 
		return top.data; 
	} 

	// Método para verificar si la pila está vacía 
	public boolean isEmpty() { 
		return top == null; 
	} 

	// Método para mostrar todos los elementos de la pila 
	public void mostrar() { 
		Nodo actual = top; 
		while (actual != null) { 
			System.out.print(actual.data + " -> "); 
			actual = actual.next; 
		} 
		System.out.println("null");
	}
	public Pila palabraComoPila(String str){
		Pila p = new Pila();
		for(int i = 0; i < str.length(); i++){
			p.push(str.charAt(i));
		}
		return p;
	}
	
	public String toString() { 
		Nodo actual = top;
		String str = "";
		while (actual != null) { 
			str += actual.data; 
			actual = actual.next; 
		}
		return str;
	}
}
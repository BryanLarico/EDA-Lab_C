import java.util.Random;

public class Nodo {
	private int valor;
	private Nodo izquierda;
	private Nodo derecha;

	public Nodo(int valor) {
		this.valor = valor;
		izquierda = null;
		derecha = null;
	}

	public int getValor() {
		return valor;
	}

	public Nodo getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(Nodo nodo) {
		this.izquierda = nodo;
	}

	public Nodo getDerecha() {
		return derecha;
	}

	public void setDerecha(Nodo nodo) {
		this.derecha = nodo;
	}
}
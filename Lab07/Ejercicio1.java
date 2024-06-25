import java.util.*;
import java.util.Iterator;

public class Ejercicio1{
	public static void main(String[] args){
		LinkedList<Integer> listaE = new LinkedList<Integer>();
		listaE.insertLast(10);
		System.out.println(listaE);
		listaE.insertLast(11);
		System.out.println(listaE);
		listaE.insertLast(4);
		System.out.println(listaE);
		listaE.insertLast(3);
		System.out.println(listaE);
		listaE.insertLast(67);
		System.out.println(listaE);
		listaE.insertLast(1);
		System.out.println(listaE);
		listaE.insertLast(0);
		borrarMayoresA(10, listaE);
		System.out.println(listaE);
	}
	public static void borrarMayoresA(int num, LinkedList<Integer> l){
		Node<Integer> i = l.getHead();
		while(i != null){
			if(i.getData() > num)
				l.remove(i.getData());
			i = i.getNext();
		}
	}
}
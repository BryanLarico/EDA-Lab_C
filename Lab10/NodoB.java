import java.util.*;  
class NodoB { 
	int t;
	ArrayList<Integer> llaves; 
	ArrayList<NodoB> hijos; 
	boolean hoja; 

	public NodoB(int t, boolean hoja) { 
		this.t = t; 
		this.hoja = hoja; 
		this.llaves = new ArrayList<>(); 
		this.hijos = new ArrayList<>(); 
	} 
} 
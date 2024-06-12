//Autor: Bryan Fernando Larico Rodriguez
//Ejercicio: 1
import java.util.*;
public class Calculadora{
	private int primerInt;
	private int segundoInt;
	private float primerFloat;
	private float segundoFloat;
	private String operador;
	
	public Calculadora(int p, String o, int s){
		primerInt = p;
		segundoInt = s;
		operador = o;
	}
	
	public Calculadora(float p, String o, float s){
		primerFloat = p;
		segundoFloat = s;
		operador = o;
	}
	
	public int operacionInt(){
		int resultadoInt = 0;
		switch(operador){
			case "+":
				resultadoInt = primerInt + segundoInt;
				break;
			case "-":
				resultadoInt = primerInt - segundoInt;
				break;
			case "*":
				resultadoInt = primerInt * segundoInt;
				break;
			case "/":
				resultadoInt = primerInt / segundoInt;
				break;
		}
		return resultadoInt;
	}
	
	public float operacionFloat(){
		float resultadoFloat = 0;
		switch(operador){
			case "+":
				resultadoFloat = primerFloat + segundoFloat;
				break;
			case "-":
				resultadoFloat = primerFloat - segundoFloat;
				break;
			case "*":
				resultadoFloat = primerFloat * segundoFloat;
				break;
			case "/":
				resultadoFloat = primerFloat / segundoFloat;
				break;
		}
		return resultadoFloat;
	}
}
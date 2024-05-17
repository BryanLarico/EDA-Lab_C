import java.util.*;
public class Persona{
	private String nombre = "";
	private int edad = 0;
	private char sexo = 'H';
	private int peso = 0;
	private double altura = 0;
	private final int DESNUTRICION = -1;
	private final int PESO_IDEAL = 0;
	private final int SOBRE_PESO = 1;
	private final double IMC_INFERIOR = 18.5;
	private final double IMC_SUPERIOR = 25.0;
	
	public Persona(){
	}
	
	public Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, char sexo, int peso, double altura){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC(){
		
	}
}
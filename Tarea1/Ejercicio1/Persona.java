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
	
	public void setNombre(String n){
		nombre = n;
	}
	public void setEdad(int e){
		edad = e;
	}
	public void setSexo(char s){
		sexo = s;
	}
	public void setPeso(int p){
		peso = p;
	}
	public void setAltura(double a){
		altura = a;
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public char getSexo(){
		return sexo;
	}
	public double getPeso(){
		return peso;
	}
	public double getAltura(){
		return altura;
	}
	public int calcularIMC(){
		double imc = peso / altura;
		if(imc < IMC_INFERIOR)
			return -1;
		else if(IMC_INFERIOR <= imc && imc <= IMC_SUPERIOR)
			return 0;
		return 1;
	}
	
	public boolean esMayorDeEdad(){
		return edad > 17;
	}
	
	//public boolean comprobarSexo(char sexo){
	//}
	
	public String toString(){
		String n = "Nombre: " + nombre;
		String e = "Edad : " + edad;
		String s = "Sexo : " + sexo;
		String p = "Peso : " + peso;
		String a = "Altura: " + altura;
		return n + "\n" + e + "\n" + s + "\n" + p + "\n" + a;
	}
}
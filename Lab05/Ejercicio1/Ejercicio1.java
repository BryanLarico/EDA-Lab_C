//Lab05 - Ejercicio01
//Autor: Bryan Fernando Larico Rodriguez
import java.util.*;
class Ejercicio1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Desea usar Enteros o Decimales (E/D): ");
		String tipo = sc.next();
		System.out.print("Introduzca operador: ");
		String operador = sc.next();
		switch(tipo){
			case "E":
				System.out.print("Introduzca primer numero: ");
				int int1 = sc.nextInt();
				System.out.print("Introduzca segundo numero: ");
				int int2 = sc.nextInt();
				System.out.print(int1 + " " + operador + " " + int2 +  " = ");
				System.out.print(int1 + " " + operador + " " + int2 +  " = ");
				Calculadora calI = new Calculadora(int1, operador, int2);
				System.out.print(calI.operacionInt());
				break;
			case "D":
				System.out.print("Introduzca primer numero: ");
				float float1 = sc.nextFloat();
				System.out.print("Introduzca segundo numero: ");
				float float2 = sc.nextFloat();
				System.out.print(float1 + " " + operador + " " + float2 +  " = ");
				Calculadora calF = new Calculadora(float1, operador, float2);
				System.out.print(calF.operacionFloat());
				break;
		}

	}
}
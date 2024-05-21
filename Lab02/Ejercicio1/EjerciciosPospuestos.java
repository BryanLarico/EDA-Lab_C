import java.util.*;
public class EjerciciosPospuestos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba numero a invertir: ");
		int numero = sc.nextInt();
		System.out.println(invertirNumero(numero));
	}
	public static int invertirNumero(int num){
		if(num / 10 == 0) // Caso base
			return num;				
		return (num % 10) * digitos(num) + invertirNumero(num / 10);
		//Primero seleciona el ultimo numero, luego multiplica por su descomposicion
		//Finaliza con el paso recursivo de los demas numeros excepto el ultimo
	}
	public static int digitos(int num){
		if(num == 0)
			return 1;
		int conDigit = 0;
		while(num != 0){
			num /= 10;
			conDigit++;
		}
		return (int) (Math.pow(10,conDigit - 1));
	}
}
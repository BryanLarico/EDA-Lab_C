import java.util.*;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba posible palindrome: ");
		String palabra = sc.next();
		System.out.println(esPalindrome(palabra));
	}
	public static boolean esPalindrome(String str){
		if(str.length() <= 1)
			return true;
		if(str.charAt(0) == str.charAt(str.length() - 1))
			return esPalindrome(str.substring(1,str.length() - 1));
		return false;
	}
}
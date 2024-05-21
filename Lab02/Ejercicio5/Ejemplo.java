import java.util.Scanner;
class Ejemplo{
	public static void main(String[] args){
		System.out.print(escaleraFiguras(*, 10));
	}
	public static String escaleraFiguras(String figura, int num){
		String final FIGURA_PURA = figura;
		if(num == 1)
			return "";
		return figura + "\n" + estrellas(figura + FIGURA_PURA, num - 1);
	}
}
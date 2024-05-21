import java.util.Scanner;
class Ejemplo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ESCALERA DE FIGURAS REPETIDAS");
		System.out.print("Escriba la figura que quiere crear (caracter especial por ejemplo): ");
		String figura = sc.next();
		System.out.print("Escriba el numero de veces que desea que se repita: ");
		int repeticiones = sc.nextInt();
		System.out.print(escaleraFiguras(figura, repeticiones));
	}
	public static String escaleraFiguras(String figura, int num){
		if(num == 0)
			return "";
		return figura + "\n" + escaleraFiguras(figura + figura.charAt(0), num - 1);
	}
}
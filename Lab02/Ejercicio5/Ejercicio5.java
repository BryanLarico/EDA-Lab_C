import java.util.Scanner;
class Ejercicio5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] arreglo = {1, 21, 34, 42, 45, 78, 91, 98};
		System.out.print("Se muestra el siguiente arreglo: ");
		mostrarArreglo(arreglo);
		System.out.print("Introducir el valor del arreglo a buscar: ");
		int valor = sc.nextInt();
		System.out.print("El indice con ese valor es: ");
		System.out.print(busquedaBinaria(arreglo, valor));
	}
	public static int busquedaBinaria(int [] lista, int valor){
		int baja, media, alta;
		baja = 0;
		alta = lista.length - 1;
		while(baja <= alta){
			media = (alta + baja) / 2;
			if(lista[media] == valor)
				return media;
			else
				if(valor < lista[media])
					alta = media - 1;
				else
					baja = media + 1;
		}
		return -1;
	}
	public static void mostrarArreglo(int [] lista){
		System.out.print("{");
		for(int i = 0; i < lista.length; i++){
			System.out.print(lista[i]);
			if(i + 1 < lista.length)
				System.out.print(", ");
		}
		System.out.println("}");
	}
}
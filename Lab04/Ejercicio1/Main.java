import java.util.*;
class Main{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,2,0,2,3,2,4,3,3,4));
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(2,2,1,1));
		System.out.print("Mundo normal:    ");
		System.out.println(list);
		System.out.println(ProblemaSaltosPDR.minimoSaltosParaLlegar(list, 0));
  }
}
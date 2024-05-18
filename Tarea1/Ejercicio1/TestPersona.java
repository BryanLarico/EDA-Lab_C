import java.util.*;
public class TestPersona{
	public static void main(String[] args){
		Persona person1 = new Persona();
		Persona person2 = new Persona("Bryan Larico", 18, 'H');
		Persona person3 = new Persona("Yofri Quispe", 18, 'M', 70, 1.84);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
}
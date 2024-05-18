import java.util.*;
public class TestPersona{
	public static void main(String[] args){
		Persona person1 = new Persona();
		Persona person2 = new Persona("Bryan Larico", 18, 'H');
		Persona person3 = new Persona("Yofri Quispe", 18, 'M', 70, 1.84);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		if(person3.esMayorDeEdad())
			System.out.println(person3.getNombre() + " es mayor de edad");
		else
			System.out.println(person3.getNombre() + " es mayor de edad");
		person1.setNombre("Jesus Rodriguez");
		person1.setEdad(59);
		person1.setSexo('H');
		person1.setPeso(70);
		person1.setAltura(1.72);
		if(person1.calcularIMC() == -1)
			System.out.println(person1.getNombre() + " sufre desnutrición");
		else if(person1.calcularIMC() == 0)
			System.out.println(person1.getNombre() + " tiene peso ideal");
		else
			System.out.println(person1.getNombre() + " sufre sobrepeso");
		
	}
}
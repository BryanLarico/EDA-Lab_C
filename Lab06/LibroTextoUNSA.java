public class LibroTextoUNSA extends LibroTexto{
	private String facultad;
	
	public LibroTextoUNSA(String titulo, String autor, String curso, String facultad){
		super(titulo, autor, curso);
		this.facultad = facultad;
	}
	public String toString(){
		return super.toString() + "Facultad: " + facultad + "\n";
	}
}
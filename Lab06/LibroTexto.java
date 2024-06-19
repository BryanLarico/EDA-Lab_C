public class LibroTexto extends Libro{
	private String curso;
	
	public LibroTexto(String titulo, String autor, String curso){
		super(titulo, autor);
		this.curso = curso;
	}
	
	public String toString(){
		return super.toString() + "Curso: " + curso + "\n";
	}
}
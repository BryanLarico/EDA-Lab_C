public class Libro{
	private String titulo;
	private String autor;
	private double precio;
	
	public Libro(String titulo, String autor){
		setTitulo(titulo);
		setAutor(autor);
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}
	public String getTitulo(){
		return titulo;
	}
	public String getAutor(){
		return autor;
	}
	public double getPrecio(){
		return precio;
	}
	public String toString(){
		String t = "Titulo: " + titulo + "\n";
		String a = "Autor: " + autor + "\n";
		String p = "Precio: " + precio + "\n";
		return t + a + p;
	}
}
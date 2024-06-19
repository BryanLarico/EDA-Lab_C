public class Novela extends Libro{
	public final String [] TIPO = {"Historica","Romantica","Policiaca","Realista","Ciencia Ficcion", "Aventura"};
	private String tipoNovela;
	
	public Novela(String titulo, String autor, String tipoNovela){
		super(titulo, autor);
		if(esTipoNovela(tipoNovela))
			this.tipoNovela = tipoNovela;
		else
			System.out.print("No es un tipo correcto de novela\n");
	}
	
	public boolean esTipoNovela(String novela){
		for(String tipo: TIPO)
			if(tipo.toUpperCase().equals(novela.toUpperCase()))
				return true;
		return false;
	}
	
	public String toString(){
		if(tipoNovela != null)
			return super.toString() + "Novela: " + tipoNovela;
		return "";
	}
}
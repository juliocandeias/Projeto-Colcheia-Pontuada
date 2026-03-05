package entidades;

public class Forma {
	public int id_forma;
	public int instrumentos;
	public String Nome;
	
	public void Forma(int id_forma, int instrumentos, String Nome) {
		this.id_forma = id_forma;
		this.instrumentos = instrumentos;
		this.Nome = Nome;
	}
	
	public void setid_forma(int id_forma) {
		this.id_forma = id_forma;
	};
	
	public void setinstrumentos(int instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	public void setnome(String Nome) {
		this.Nome = Nome;
	
	}
}
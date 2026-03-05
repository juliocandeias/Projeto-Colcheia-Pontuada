package entidades;

public class Instrumento {
	public int id_instrumento;
	public String Nome;
	
	public void Instrumento(int id_instrumento, String Nome) {
		this.id_instrumento = id_instrumento;
		this.Nome = Nome;
	}
	
	public void setid_instrumento(int id_instrumento) {
		this.id_instrumento = id_instrumento;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
}
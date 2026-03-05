package entidades;

public class Repertorio {
	public int id_repertorio;
	public int partituras;
	public int forma;
	public String Nome;
	
	public Repertorio(int id_repertorio, int partituras, int forma, String Nome) {
		this.id_repertorio = id_repertorio;
		this.partituras = partituras;
		this.forma = forma;
		this.Nome = Nome;
	}
	
	public void setid_repertorio (int id_repertorio) {
		this.id_repertorio = id_repertorio;
	}
	
	public void setpartituras (int partituras) {
		this.partituras = partituras;
	}

	public void setforma (int forma) {
		this.forma = forma;
	}
	
	public void setNome (String Nome) {
		this.Nome = Nome;
	}
}
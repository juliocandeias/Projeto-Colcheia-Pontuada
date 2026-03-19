package entidades;

import java.util.ArrayList;
import java.util.List;

public class Repertorio {
	private int id_repertorio;
	private String Nome;
	private List<Grupo>grupo;
	private List<Peca>peca;
	
	public Repertorio(int id_repertorio, String Nome) {
		this.setId_repertorio(id_repertorio);
		this.Nome = Nome;
		this.setGrupo(new ArrayList());
		this.setPeca(new ArrayList());
	}
	
	public void setid_repertorio (int id_repertorio) {
		this.setId_repertorio(id_repertorio);
	}
	
	public void setNome (String Nome) {
		this.Nome = Nome;
	}

	public String getNome (String Nome) {
		return Nome;
	}
	 
	public int getId_repertorio() {
		return id_repertorio;
	}

	public void setId_repertorio(int id_repertorio) {
		this.id_repertorio = id_repertorio;
	}

	public List<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}

	public List<Peca> getPeca() {
		return peca;
	}

	public void setPeca(List<Peca> peca) {
		this.peca = peca;
	}
}
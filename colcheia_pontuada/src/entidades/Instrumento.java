package entidades;

import java.util.ArrayList;
import java.util.List;

public class Instrumento {
	private int id_instrumento;
	private String nome;
	private String familia;
	private List<Musico>musico;
	private List<Forma>forma;
	
	
	public void Instrumento(int id_instrumento, String nome, String familia) {
		this.setId_instrumento(id_instrumento);
		this.nome = nome;
		this.familia = familia;
		this.setMusico(new ArrayList());
		this.setForma(new ArrayList());
	}
	
	public void setid_instrumento(int id_instrumento) {
		this.setId_instrumento(id_instrumento);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public int getId_instrumento() {
		return id_instrumento;
	}

	public void setId_instrumento(int id_instrumento) {
		this.id_instrumento = id_instrumento;
	}

	public List<Forma> getForma() {
		return forma;
	}

	public void setForma(List<Forma> forma) {
		this.forma = forma;
	}

	public List<Musico> getMusico() {
		return musico;
	}

	public void setMusico(List<Musico> musico) {
		this.musico = musico;
	}
}
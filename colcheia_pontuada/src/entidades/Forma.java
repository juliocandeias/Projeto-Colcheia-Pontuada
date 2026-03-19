package entidades;

import java.util.ArrayList;
import java.util.List;

public class Forma {
	private int id_forma;
	private String nome;
	private List<Instrumento>instrumento;
	
	public void Forma(int id_forma, String nome) {
		this.setId_forma(id_forma);
		this.setNome(nome);
		this.setInstrumento(new ArrayList());
	}
	
	public void setid_forma(int id_forma) {
		this.setId_forma(id_forma);
	};
	
	
	public void setnome(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_forma() {
		return id_forma;
	}

	public void setId_forma(int id_forma) {
		this.id_forma = id_forma;
	}

	public List<Instrumento> getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(List<Instrumento> instrumento) {
		this.instrumento = instrumento;
	}
}
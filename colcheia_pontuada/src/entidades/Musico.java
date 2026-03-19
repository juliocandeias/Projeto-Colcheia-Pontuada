package entidades; 

import java.util.ArrayList;
import java.util.List;

public class Musico {
	private int id_musico;
	private String nome;
	private String nivel;
	
	private List<Grupo>grupo;
	private List<Partitura>partitura;
	private List<Instrumento>instrumento;
	
	public void Musico(int id_musico, String nome, String nivel) {
		this.setId_musico(id_musico);
		this.setNome(nome);
		this.setNivel(nivel);
		this.setGrupo(new ArrayList());
		this.setPartitura(new ArrayList());
		this.setInstrumento(new ArrayList());
	};
	
	public void setnome(String nome) {
		this.setNome(nome);
	}
	
	public void setid_musico(int id_musico) {
		this.setId_musico(id_musico);
	}
	
	public void setnivel(String nivel) {
		this.setNivel(nivel);
	}

	public int getId_musico() {
		return id_musico;
	}

	public void setId_musico(int id_musico) {
		this.id_musico = id_musico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public List<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}

	public List<Partitura> getPartitura() {
		return partitura;
	}

	public void setPartitura(List<Partitura> partitura) {
		this.partitura = partitura;
	}

	public List<Instrumento> getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(List<Instrumento> instrumento) {
		this.instrumento = instrumento;
	}
}
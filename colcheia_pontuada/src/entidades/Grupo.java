package entidades;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private int id_grupo;
	private String nome;
	private String nivel;
	private List<Forma>forma;
	private List<Maestro>maestro;
	
	private List<Musico>musico;
	
	public void Grupo(int id_grupo, String nome, String nivel) {
		this.setId_grupo(id_grupo);
		this.setNome(nome);
		this.setNivel(nivel);
		this.setForma(new ArrayList());
		this.setMaestro(new ArrayList());
		this.musico = new ArrayList();

	}
	
	public void setnome(String nome) {
		this.setNome(nome);
	}

	public int getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
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

	public List<Forma> getForma() {
		return forma;
	}

	public void setForma(List<Forma> forma) {
		this.forma = forma;
	}

	public List<Maestro> getMaestro() {
		return maestro;
	}

	public void setMaestro(List<Maestro> maestro) {
		this.maestro = maestro;
	}
}
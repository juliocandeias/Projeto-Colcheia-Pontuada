package entidades;

import java.util.ArrayList;
import java.util.List;

public class Maestro {
	private int id_maestro;
	private String nome;
	private String espec;
	
	public void Maestro(int id_maestro, String nome, String espec) {
		this.setId_maestro(id_maestro);
		this.setNome(nome);
		this.setEspec(espec);
	}
	
	public void setnome(String nome) {
		this.setNome(nome);
	}
	
	public void setid_maestro(int id_maestro) {
		this.setId_maestro(id_maestro);
	};
	
	
	public void setespec(String espec) {
		this.setEspec(espec);
	}

	public int getId_maestro() {
		return id_maestro;
	}

	public void setId_maestro(int id_maestro) {
		this.id_maestro = id_maestro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspec() {
		return espec;
	}

	public void setEspec(String espec) {
		this.espec = espec;
	};
}
package entidades;

import java.util.ArrayList;
import java.util.List;

public class Peca {
	private int id_peca;
	private String nome;
	private int bpm;
	private int tonalidade;
	private List<Forma>forma;
	private List<Repertorio>repertorio;
	
	public void cadastrarForma(Forma forma) {
		this.forma.add(forma);
	}
	
	
	public void Peca(int id_peca, String nome, int bpm, int tonalidade) {
		this.setId_peca(id_peca);
		this.setNome(nome);
		this.setBpm(bpm);
		this.setTonalidade(tonalidade);
		this.forma = new ArrayList();
		this.setRepertorio(new ArrayList());
	}

	public int getId_peca() {
		return id_peca;
	}

	public void setId_peca(int id_peca) {
		this.id_peca = id_peca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public int getTonalidade() {
		return tonalidade;
	}

	public void setTonalidade(int tonalidade) {
		this.tonalidade = tonalidade;
	}


	public List<Repertorio> getRepertorio() {
		return repertorio;
	}


	public void setRepertorio(List<Repertorio> repertorio) {
		this.repertorio = repertorio;
	}
	
}
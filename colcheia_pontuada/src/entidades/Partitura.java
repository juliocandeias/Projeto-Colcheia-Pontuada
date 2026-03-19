package entidades;

import java.util.ArrayList;
import java.util.List;

public class Partitura {
	private int id_partitura;
    private String Nome;
    private int Tom;
    private float Tempo;
    
    private List<Musico>musico;

    public Partitura(int id_partitura, String Nome, int Tom, float Tempo) {
        this.setId_partitura(id_partitura);
        this.Nome = Nome;
        this.Tom = Tom;
        this.setTempo(Tempo);
        this.setMusico(new ArrayList());
    }
    
    
    public void setid_partitura(int id_partitura) {
        this.setId_partitura(id_partitura);
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTom(int Tom) {
        this.Tom = Tom;
    }

    public void setTempo(int Tempo) {
        this.Tempo = Tempo;
    }

	public int getId_partitura() {
		return id_partitura;
	}

	public void setId_partitura(int id_partitura) {
		this.id_partitura = id_partitura;
	}


	public float getTempo() {
		return Tempo;
	}


	public void setTempo(float tempo) {
		Tempo = tempo;
	}


	public List<Musico> getMusico() {
		return musico;
	}


	public void setMusico(List<Musico> musico) {
		this.musico = musico;
	}

}

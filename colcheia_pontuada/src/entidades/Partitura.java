package entidades;

public class Partitura {
    public int id_partitura;
    public String Nome;
    public int Forma;
    public int Tom;
    public float Tempo;

    public Partitura(int id_partitura, String Nome, int Tom, int Forma, float Tempo) {
        this.id_partitura = id_partitura;
        this.Nome = Nome;
        this.Forma = Forma;
        this.Tom = Tom;
        this.Tempo = Tempo;
    }

    public void setid_partitura(int id_partitura) {
        this.id_partitura = id_partitura;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setForma(int Forma) {
        this.Forma = Forma;
    }

    public void setTom(int Tom) {
        this.Tom = Tom;
    }

    public void setTempo(int Tempo) {
        this.Tempo = Tempo;
    }

}

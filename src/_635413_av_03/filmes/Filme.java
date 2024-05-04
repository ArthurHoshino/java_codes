package _635413_av_03.filmes;

public class Filme {
    private String idFilme;
    private String nomeFilme;
    private String categoria;
    private String[] nomeAtores = new String[10];
    private String dataLancamento;

    public Filme(String nome, String categoria) {
        this.nomeFilme = nome;
        this.categoria = categoria;
    }

    // GETTERS
    public String getIdFilme() { return this.idFilme; }
    public String getNomeFilme() { return this.nomeFilme; }
    public String getCategoria() { return this.categoria; }
    public String[] getNomeAtores() { return this.nomeAtores; }
    public String getDataLancamento() { return this.dataLancamento; }

    // SETTERS
    public void setIdFilme(String id) { this.idFilme = id; }
    public void setNomeFilme(String n) { this.nomeFilme = n; }
    public void setCategoria(String c) { this.categoria = c; }
    public void setNomeAtores(String[] na) { this.nomeAtores = na; }
    public void setDataLancamento(String d) { this.dataLancamento = d; }

    @Override
    public String toString() {
        String nomes = "";

        for (int i = 0; i < 9; i++) {
            nomes += this.nomeAtores[i] + ", ";
        }
        nomes += this.nomeAtores[9];

        return "Id: " + this.idFilme + "\nNome do filme: " + this.nomeFilme + 
            "\nCategoria: " + this.categoria + "\nData de lancamento: " + this.dataLancamento + 
            "\nAtores: " + nomes + "\n\n";
    }
}

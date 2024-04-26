package atividades._635413_av_03;
import java.util.*;

public class Netflix {
    private List<Filme> filmes = new ArrayList<Filme>();
    private int qtdFilme = 0;

    public Netflix(Filme[] f) {
        this.setFilme(f);
    }
    public Netflix() {}

    // Getters
    public Filme getByIndex(int index) {
        if (index <= this.qtdFilme) return this.filmes.get(index);
        return null;
    }
    public Filme getById(String id) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getIdFilme() == id) return this.filmes.get(i);
        }
        return null;
    }
    public Filme getByNome(String n) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getNomeFilme() == n) return this.filmes.get(i);
        }
        return null;
    }
    public Filme getByCategoria(String c) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getCategoria() == c) return this.filmes.get(i);
        }
        return null;
    }
    public Filme getByAtor(String a) {
        for (int i = 0; i < this.filmes.size(); i++) {
            String[] tmp = this.filmes.get(i).getNomeAtores();
            for (int j = 0; j < 10; j++) {
                if (tmp[j] == a) return this.filmes.get(i);
            }
        }
        return null;
    }
    public Filme getByData(String d) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getDataLancamento() == d) return this.filmes.get(i);
        }
        return null;
    }

    // Setter
    public void setFilme(Filme[] f) {
        for (int i = 0; i < f.length; i++) {
            this.filmes.add(f[i]);
        }
        this.qtdFilme = this.filmes.size();
    }
}

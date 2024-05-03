package atividades._635413_av_03.filmes;
import java.util.*;

public class Netflix {
    private List<Filme> filmes = new ArrayList<Filme>();
    private int qtdFilme = 0;

    public Netflix(Filme[] f) {
        this.setFilme(f);
    }
    public Netflix() {}

    // Getters
    public List<Filme> getAll() { return this.filmes; }

    public Filme getByIndex(int index) {
        if (index <= this.qtdFilme) return this.filmes.get(index);
        return null;
    }
    public Filme getById(String id) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getIdFilme().equals(id)) return this.filmes.get(i);
        }
        return null;
    }
    public Filme getByNome(String n) {
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getNomeFilme().equals(n)) return this.filmes.get(i);
        }
        return null;
    }
    
    public List<Filme> getByCategoria(String c) {
        List<Filme> filmeRetorno = new ArrayList<Filme>();
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getCategoria().equals(c)) filmeRetorno.add(this.filmes.get(i));
        }
        if (filmeRetorno.size() != 0) return filmeRetorno;
        else return null;
    }

    public List<Filme> getByAtor(String a) {
        List<Filme> filmeRetorno = new ArrayList<Filme>();
        for (int i = 0; i < this.filmes.size(); i++) {
            String[] tmp = this.filmes.get(i).getNomeAtores();
            if (Arrays.stream(tmp).anyMatch(a::equals)) filmeRetorno.add(this.filmes.get(i));
        }
        if (filmeRetorno.size() != 0) return filmeRetorno;
        else return null;
    }
    
    public List<Filme> getByData(String d) {
        List<Filme> filmeRetorno = new ArrayList<Filme>();
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).getDataLancamento().equals(d)) filmeRetorno.add(this.filmes.get(i));
        }
        if (filmeRetorno.size() != 0) return filmeRetorno;
        else return null;
    }

    public String[] getCategorias() {
        Set<String> tmp = new HashSet<String>();

        for (int i = 0; i < this.filmes.size(); i++) {
            String c = this.filmes.get(i).getCategoria();
            if (!tmp.contains(c)) { tmp.add(c); }
        }

        String[] cRetorno = tmp.toArray(new String[tmp.size()]);

        return cRetorno;
    }

    // Setter
    public void setFilme(Filme f) {
        this.filmes.add(f);
        this.qtdFilme = this.filmes.size();
    }
    public void setFilme(Filme[] f) {
        for (int i = 0; i < f.length; i++) {
            this.filmes.add(f[i]);
        }
        this.qtdFilme = this.filmes.size();
    }
}

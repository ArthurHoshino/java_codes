package atividades._635413_av_03.menu;
import java.util.*;

import javax.swing.JOptionPane;
import atividades._635413_av_03.filmes.*;

public class FilmesActions {
    private Netflix netflixObj;
    private Choices ch = new Choices();
    private MenuOpt menuObj, menuEdit = new MenuOpt(ch.getEditOpt());
    private String[] optFlag = { "Nome", "Categoria", "Nome do ator", "Data de lancamento", "none" };
    private String[] filtrosOpt = { "Nome", "Categoria", "Nome do ator", "Data de lancamento", "none" };
    private int flag = 4;

    public FilmesActions(Netflix n, MenuOpt m) {
        this.netflixObj = n;
        this.menuObj = m;
    }
    
    public void setFlag(int f) { this.flag = f; }

    /*
     * <===== AUXILIARY METHOD =====>
     */
    private void addFilme() {
        String nomeF = JOptionPane.showInputDialog("Informe o nome do filme");
        String categoriaF = JOptionPane.showInputDialog("Informe a categoria do filme");
        Filme newFilme = new Filme(nomeF, categoriaF);

        netflixObj.setFilme(newFilme);
    }

    private void editFilme() {
        List<Filme> allFilmes = netflixObj.getAll();
        String[] filmesNomes = new String[allFilmes.size() + 1], atoresEditInfo = new String[10];
        String filmeOpt, editInfo;
        int opt;

        for (int i = 0; i < allFilmes.size(); i++) {
            filmesNomes[i] = allFilmes.get(i).getNomeFilme();
        }
        filmesNomes[allFilmes.size()] = "Sair";

        menuObj.setOptions(filmesNomes);

        do {
            filmeOpt = menuObj.menu();
            System.out.println(filmeOpt);

            if ( (filmeOpt != null) && (filmeOpt != "Sair") ) {
                do {
                    opt = menuEdit.getOptDoubleIndex(menuEdit.menu());
        
                    switch (opt) {
                        case 20:
                            editInfo = JOptionPane.showInputDialog("Informe o novo ID");
                            netflixObj.getByNome(filmeOpt).setIdFilme(editInfo);
                            break;
                        case 21:
                            editInfo = JOptionPane.showInputDialog("Informe o novo NOME");
                            netflixObj.getByNome(filmeOpt).setNomeFilme(editInfo);
                            break;
                        case 22:
                            editInfo = JOptionPane.showInputDialog("Informe a nova CATEGORIA");
                            netflixObj.getByNome(filmeOpt).setCategoria(editInfo);
                            break;
                        case 23:
                            for (int i = 0; i < 10; i++) {
                                atoresEditInfo[i] = JOptionPane.showInputDialog("Informe o ATOR " + (i + 1));
                            }
        
                            netflixObj.getByNome(filmeOpt).setNomeAtores(atoresEditInfo);
                            break;
                        case 24:
                            editInfo = JOptionPane.showInputDialog("Informe a nova DATA (YYYY-MM-DD)");
                            netflixObj.getByNome(filmeOpt).setDataLancamento(editInfo);
                            break;
                        case 25:
                            opt = -1;
                    }
                } while (opt != -1);
            } else {
                menuObj.setOptions(ch.getActionsOpt());
                filmeOpt = null;
            }
        } while (filmeOpt != null);
    }

    private void byId() {
        String id = JOptionPane.showInputDialog("Informe o ID do filme");
        Filme filmeInfo = netflixObj.getById(id);
        if (filmeInfo != null) JOptionPane.showMessageDialog(null, filmeInfo, "MOVIE INFO", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Verifique se digitou o nome correto", "FILME NAO ENCONTRADO", JOptionPane.WARNING_MESSAGE);
    }

    private void byNome() {
        String n = JOptionPane.showInputDialog(null, "Informe o nome do filme");
        Filme filmeInfo = netflixObj.getByNome(n);
        if (filmeInfo != null) JOptionPane.showMessageDialog(null, filmeInfo, "MOVIE INFO", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Verifique se digitou o nome correto", "FILME NAO ENCONTRADO", JOptionPane.WARNING_MESSAGE);
    }
    private void byNome(String n) {
        JOptionPane.showMessageDialog(null, netflixObj.getByNome(n), "MOVIE INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    private void byCategoria(String c) {
        List<Filme> response = netflixObj.getByCategoria(c);
        String[] filmesNomes = new String[response.size() + 1];

        for (int i = 0; i < response.size(); i++) {
            filmesNomes[i] = response.get(i).getNomeFilme();
        }
        filmesNomes[response.size()] = "Sair";

        menuObj.setOptions(filmesNomes);
    }

    private void changeMenuByAtor() {
        String ator = JOptionPane.showInputDialog("Informe o nome de um ator");
        List<Filme> response = netflixObj.getByAtor(ator);
        String[] filmesNomes = new String[response.size()];

        for (int i = 0; i < response.size(); i++) {
            filmesNomes[i] = response.get(i).getNomeFilme();
        }

        menuObj.setOptions(filmesNomes);
    }

    /*
     * <===== MAIN METHOD =====>
     */
    public void doAction(int opt) {
        switch (opt) {
            case 0:
                break;
            case 1:
                this.addFilme();
                break;
            case 2:
                this.editFilme();
                break;
            case 4:
                this.byId();
                break;
            case 5:
                this.byNome();
                break;
            case 6:
                this.menuObj.setOptions(this.netflixObj.getCategorias());
                break;
            case 7:
                this.changeMenuByAtor();
                break;
            case 8:
                break;
            default:
                System.out.println("Nao sei como viria aqui");
                break;
        }
    }
    
    public void doAction(String opt) {
        // nas opcoes de numero eu mudo a flag e ai eu consigo passar por aqui
        System.out.println(opt + " | " + this.flag);
        switch (this.filtrosOpt[this.flag]) {
            case "Nome":
                this.byNome(opt);
                break;
            case "Categoria":
                this.byCategoria(opt);
                this.flag = 4;
                break;
            case "Nome do ator":
                this.flag = 4;
                break;
            case "Data de lancamento":
                this.flag = 4;
                break;
            default:
                System.out.println("Aqui eu acho que quando for para Sair...?");
                if (opt != "Sair") this.byNome(opt);
                else menuObj.setOptions( ch.getFiltrosOpt() );
                break;
        }
    }
}

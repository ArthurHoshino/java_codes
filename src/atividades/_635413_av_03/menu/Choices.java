package atividades._635413_av_03.menu;

public class Choices {
    private String[] actionOpt = {
        "1. Adicionar filme",
        "2. Editar filme",
        "3. Consultar filmes",
        "0. Sair"
    };
    private String[] filtrosOpt = {
        "4. ID",
        "5. Nome",
        "6. Categoria",
        "7. Nome de ator",
        "8. Data de lancamento",
        "9. Voltar"
    };
    private String[] editOpt = {
        "20. ID",
        "21. Nome",
        "22. Categoria",
        "23. Nome de ator",
        "24. Data de lancamento",
        "25. Voltar"
    };
    private String[] categoriaOpt;

    // Getters
    public String[] getActionsOpt() { return this.actionOpt; }
    public String[] getFiltrosOpt() { return this.filtrosOpt; }
    public String[] getCategoriasOpt() { return this.categoriaOpt; }
    public String[] getEditOpt() { return this.editOpt; }

    // Setters
    public void setCategoriasOpt(String[] c) { this.categoriaOpt = c; }
}

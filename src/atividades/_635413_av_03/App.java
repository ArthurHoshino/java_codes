package atividades._635413_av_03;

public class App {
    public static void main(String[] args) {
        String[] nomes = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj"},
            nomes2 = {"kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt"},
            nomes3 = {"ab", "cb", "db", "eb", "fb", "gb", "hb", "ib", "jb", "kb"};
        Filme f1 = new Filme("Nataguaiaba", "Comedia"),
            f2 = new Filme("Froquismuciri", "Acao"),
            f3 = new Filme("Leite Compensado", "Terror");

        f1.setIdFilme("123456");
        f2.setIdFilme("782673");
        f3.setIdFilme("908062");

        f1.setNomeAtores(nomes);
        f2.setNomeAtores(nomes2);
        f3.setNomeAtores(nomes3);

        f1.setDataLancamento("2007-06-25");
        f2.setDataLancamento("2018-04-12");
        f3.setDataLancamento("2002-10-03");
        
        /*
         * Adicionar filmes (Quantidades diferentes)
         */
        Filme[] filmes = {f1, f2};
        Netflix n = new Netflix();

        n.setFilme(filmes);

        Filme[] t = {f3};
        n.setFilme(t);

        /*
         * Busca por indice
         */
        System.out.println("<===== INDICE =====>");
        System.out.println(n.getByIndex(0));
        System.out.println(n.getByIndex(1));
        System.out.println(n.getByIndex(2));

        /*
         * Busca pelo ID do filme
         */
        System.out.println("<===== ID =====>");
        System.out.println(n.getById("123456"));
        System.out.println(n.getById("782673"));
        System.out.println(n.getById("908062"));

        /*
         * Busca pelo nome do filme
         */
        System.out.println("<===== NOME =====>");
        System.out.println(n.getByNome("Nataguaiaba"));
        System.out.println(n.getByNome("Froquismuciri"));
        System.out.println(n.getByNome("Leite Compensado"));

        /*
         * Busca pela categoria do filme
         */
        System.out.println("<===== CATEGORIA =====>");
        System.out.println(n.getByCategoria("Comedia"));
        System.out.println(n.getByCategoria("Acao"));
        System.out.println(n.getByCategoria("Terror"));

        /*
         * Busca por ator
         */
        System.out.println("<===== ATOR =====>");
        System.out.println(n.getByAtor("ee"));
        System.out.println(n.getByAtor("nn"));
        System.out.println(n.getByAtor("jb"));

        /*
         * Busca pela data de lancamento do filme
         */
        System.out.println("<===== DATA =====>");
        System.out.println(n.getByData("2007-06-25"));
        System.out.println(n.getByData("2018-04-12"));
        System.out.println(n.getByData("2002-10-03"));
    }
}

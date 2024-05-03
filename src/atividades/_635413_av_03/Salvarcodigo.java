package atividades._635413_av_03;

import atividades._635413_av_03.filmes.Filme;
import atividades._635413_av_03.filmes.Netflix;

public class Salvarcodigo {
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

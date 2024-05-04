package _635413_av_03;

import _635413_av_03.filmes.*;
import _635413_av_03.menu.*;

public class App {
   public static int getOptIndex(String opt) {
      return Integer.parseInt(String.valueOf(opt.charAt(0)));
   }
   public static void main(String[] args) {
      String[] nomes = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj"},
      nomes2 = {"kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt"},
      nomes3 = {"ab", "cb", "db", "eb", "fb", "gb", "hb", "ib", "jb", "kb"};

      Filme f1 = new Filme("Nataguaiaba", "Comedia"),
      f2 = new Filme("Froquismuciri", "Acao"),
      f3 = new Filme("Leite Compensado", "Terror"),
      f4 = new Filme("Chacolate", "Comedia");

      Netflix netflixObj = new Netflix();
      Choices c = new Choices();
      MenuOpt menu = new MenuOpt(c.getActionsOpt());
      FilmesActions act = new FilmesActions(netflixObj, menu);
      int opt = 1;
      String teste;

      // <===== FILMES DE TESTE =====>
      f1.setIdFilme("123456");
      f2.setIdFilme("782673");
      f3.setIdFilme("908062");
      f4.setIdFilme("581245");

      f1.setNomeAtores(nomes);
      f2.setNomeAtores(nomes2);
      f3.setNomeAtores(nomes3);
      f4.setNomeAtores(nomes2);

      f1.setDataLancamento("2007-06-25");
      f2.setDataLancamento("2018-04-12");
      f3.setDataLancamento("2002-10-03");
      f4.setDataLancamento("2018-02-22");

      netflixObj.setFilme(f1);
      netflixObj.setFilme(f2);
      netflixObj.setFilme(f3);
      netflixObj.setFilme(f4);

      do {
         teste = menu.menu();
         
         if (teste != null) {
               if (Character.isDigit(Character.valueOf(teste.charAt(0)))) { teste = teste.substring(0, 2); }
               switch (teste) {
                  case "0.":
                     opt = 0;
                     break;
                  case "1.":
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "2.":
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "3.":
                     menu.setOptions( c.getFiltrosOpt() );
                     break;
                  case "4.":
                     // ID
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "5.":
                     // Nome
                     act.setFlag(0);
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "6.":
                     // Categoria (apenas troca o menu)
                     act.setFlag(1);
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "7.":
                     // Nome de ator (apenas troca o menu)
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "8.":
                     // Data de lancamento (apenas troca o menu e por hora é apenas a data exata)
                     act.doAction( getOptIndex(teste) );
                     break;
                  case "9.":
                     menu.setOptions( c.getActionsOpt() );
                     break;
                  default:
                     // Pesquisa por string (categoria, nome de ator, data de lancamento)
                     act.doAction(teste);
                     break;
               }
         } else opt = 0;
      } while (opt != 0);
   }
}

package aula.classes;

public class ControleRemoto {
    private Televisao teve;
    
    public ControleRemoto(Televisao t) { this.teve = t; }
    
    public void aumentarV() { teve.aumentarVolume(); }
    public void diminuirV() { teve.diminuirVolume(); }
    public void aumentarC() { teve.aumentarCanal(); }
    public void diminuirC() { teve.diminuirCanal(); }
    public void definirC(int c) { teve.definirCanal(c); }
    
    public void consultaV() { teve.consultarVolume(); }
    public void consultaC() { teve.consultarCanal(); }
    public void consulta() { System.out.println(teve); }
}

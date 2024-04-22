package poo.sobrescrever;

public class Lampada {
    private int potencia;
    private String tipo;
    private boolean acesa;
    public Lampada(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getAcesa() {
        return this.acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public void apagar() {
        System.out.println("Apagando...");
        this.acesa = false;
    }

    public void acender() {
        System.out.println("Acendendo...");
        this.acesa = true;
    }

    @Override
    public String toString() {
        return "Lampada [potencia = " + potencia + ", tipo = " + tipo + ", acesa = " + acesa + "]"; 
    }
}

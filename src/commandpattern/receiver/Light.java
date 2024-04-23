package commandpattern.receiver;

public class Light {
    private boolean ligado;
    private boolean luminosidade;

    public Light(boolean ligado, boolean luminosidade) {
        this.ligado = ligado;
        this.luminosidade = luminosidade;
    }
    public Light() { this(false, false); }

    // GETTERS
    public boolean getLigado() { return this.ligado; }
    public boolean getLuminosidade() { return this.luminosidade; }

    // SETTERS
    public void on() { this.ligado = true; }
    public void off() { this.ligado = false; }
    public void up() { this.luminosidade = true; }
    public void down() { this.luminosidade = false; }

    @Override
    public String toString() {
        return "Ligado: " + this.ligado + "\nLuminosidade: " + this.luminosidade + "\n\n";
    }
}

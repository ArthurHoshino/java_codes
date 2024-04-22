package aula.classes;

public class Televisao {
    private int volume;
    private int canais;

    public Televisao(int volume, int canais) {
        this.volume = volume;
        this.canais = canais;
    }
    public Televisao() { this(1, 1); }

    // GETTERS
    public int getVolume() { return this.volume; }
    public int getCanais() { return this.canais; }

    // SETTERS
    public void setVolume(int v) { this.volume = v; }
    public void setCanais(int c) { this.canais = c; }

    public void aumentarVolume() {
        if (this.volume + 1 > 100) return;
        else this.volume++;
    }
    public void diminuirVolume() {
        if (this.volume - 1 < 1) return;
        else this.volume--;
    }
    public void aumentarCanal() {
        if (this.canais + 1 > 50) return;
        else this.canais++;
    }
    public void diminuirCanal() {
        if (this.canais - 1 < 1) return;
        else this.canais--;
    }
    public void definirCanal(int c) {
        if ((c < 1) || (c > 50)) {
            System.out.println("Canal invalido\n");
            return;
        } else this.canais = c;
    }

    public void consultarCanal() {
        System.out.println("Canal: " + this.canais + "\n\n");
    }

    public void consultarVolume() {
        System.out.println("Volume: " + this.volume + "\n\n");
    }

    @Override
    public String toString() {
        return "Canal: " + this.canais + "\nVolume: " + this.volume + "\n\n";
    }
}

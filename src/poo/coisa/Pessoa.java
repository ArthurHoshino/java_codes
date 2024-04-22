package poo.coisa;

public class Pessoa {
    private String nome;
    private String data;
    private double altura;

    // BUILDERS

    public Pessoa(String n, String d, double a){
        this.nome = n;
        this.data = d;
        this.altura = a;
    }

    public Pessoa(){}

    // SETTERS

    public void setnome(String n){
        this.nome = n;    
    }

    public void setdata(String d){
        this.data = d;
    }

    public void setaltura(double a){
        this.altura = a;
    }

    // GETTERS

    public String getnome(){
        return this.nome;
    }

    public String getdata(){
        return this.data;
    }

    public double getaltura(){
        return this.altura;
    }

    // PRINT

    @Override
	public String toString(){
		return "Nome: " + this.nome + "\nData de Nascimento: " + this.data + "\nAltura: " + this.altura;
	}
}

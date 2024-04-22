package poo.sobrecarga;

public class Sobrecarga {
    public static void main(String[] args) {
        Pessoa amigo = new Pessoa();
        
        amigo.setTelefone("1234");
        amigo.setTelefone();

        amigo.setNome("A");
        amigo.setNome();

        amigo.setIdade(4);
        amigo.setIdade();

        System.out.printf("Nome: %s\nIdade: %d\nTelefone: %s", amigo.getNome(), amigo.getIdade(), amigo.getTelefone());
    } 
}

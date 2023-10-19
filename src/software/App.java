package software;

public class App {
    private String nome;

    public App(String nome) {
        this.nome = nome;
    }

    public void abrir() {
        System.out.println("Abrindo o aplicativo " + nome);
    }

    public void fechar() {
        System.out.println("Fechando o aplicativo " + nome);
    }
}
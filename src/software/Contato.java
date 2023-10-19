package software;

public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void chamar() {
        System.out.println("Chamando " + nome + " (" + numero + ")");
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem para " + nome + " (" + numero + ")");
    }
}
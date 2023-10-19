package software;

import java.util.List;

class Telefone extends App {
    private List<Contato> contatos;

    public Telefone(List<Contato> contatos) {
        super("Telefone");
        this.contatos = contatos;
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo telefone");
    }

    public void fazerChamada(Contato contato) {
        contato.chamar();
    }
}

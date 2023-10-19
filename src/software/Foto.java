package software;

class Foto {
    private String nome;

    public Foto(String nome) {
        this.nome = nome;
    }

    public void abrir() {
        System.out.println("Visualizando a foto: " + nome);
    }

    public void zoom() {
        System.out.println("Aplicando zoom na foto: " + nome);
    }
}
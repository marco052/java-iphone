package software;

class Video {
    private String nome;

    public Video(String nome) {
        this.nome = nome;
    }

    public void play() {
        System.out.println("Reproduzindo o vídeo: " + nome);
    }
}

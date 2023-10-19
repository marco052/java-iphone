package hardware;

public class Bateria {
    private int carga;

    public Bateria() {
        carga = 100; // Inicialmente com carga máxima
    }

    public void exibirBateria() {
        System.out.println("Nível da bateria: " + carga + "%");
    }
}

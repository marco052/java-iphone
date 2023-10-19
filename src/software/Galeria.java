package software;

import java.util.ArrayList;
import java.util.List;

class Galeria {
    private List<Object> elementos; // Usando Object para armazenar Fotos e Videos

    public Galeria() {
        elementos = new ArrayList<>();
    }

    public void adicionarFoto(Foto foto) {
        elementos.add(foto);
    }

    public void adicionarVideo(Video video) {
        elementos.add(video);
    }

    public void visualizarElementos() {
        for (Object elemento : elementos) {
            if (elemento instanceof Foto) {
                Foto foto = (Foto) elemento;
                foto.abrir();
            } else if (elemento instanceof Video) {
                Video video = (Video) elemento;
                video.play();
            }
        }
    }
}
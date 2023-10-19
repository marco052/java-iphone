package celular;
import java.util.ArrayList;

import hardware.*;
import software.*;

class AparelhoCelular {
    private Bateria bateria;
    private Tela tela;
    private BotaoLigar botaoLigar;
    private BotaoVolume botaoVolume;
    private BotaoHome botaoHome;
    private ArrayList<App> apps;
    private ArrayList<Contato> contatos;

    public AparelhoCelular() {
        bateria = new Bateria();
        tela = new Tela();
        botaoLigar = new BotaoLigar();
        botaoVolume = new BotaoVolume();
        botaoHome = new BotaoHome();
        apps = new ArrayList<>();
        contatos = new ArrayList<>();
    }

    public void virarTela() {
        tela.virarTela();
    }

    public void ligarTela() {
        tela.ligarTela();
    }

    public void desligarTela() {
        tela.desligarTela();
    }
}
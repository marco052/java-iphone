package hardware;


public class Tela {
    private boolean ligada;
    private String orientacao;
    private BotaoLigar botaoLigar;
    private BotaoVolume botaoVolume;
    private BotaoHome botaoHome;

    public Tela() {
        ligada = false;
        orientacao = "retrato";
        botaoLigar = new BotaoLigar();
        botaoVolume = new BotaoVolume();
        botaoHome = new BotaoHome();
    }
    public void virarTela() {
        if (orientacao.equals("retrato")) {
            orientacao = "paisagem";
            System.out.println("orientação atual: " + orientacao);
        } else {
            orientacao = "retrato";
            System.out.println("orientação atual: " + orientacao);
        }
    }

    public void ligarTela() {
        ligada = true;
        botaoLigar.apertarBotao();
        System.out.println("tela ligada");
    }

    public void desligarTela() {
        ligada = false;
        botaoLigar.apertarBotao();
        System.out.println("tela desligada");
    }
}
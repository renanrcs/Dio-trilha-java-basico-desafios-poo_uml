package io.github.renanrcs.poo_uml.domain.model;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser{
    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void openNewTab() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Música selecionada: " + song);
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz.");
    }
}

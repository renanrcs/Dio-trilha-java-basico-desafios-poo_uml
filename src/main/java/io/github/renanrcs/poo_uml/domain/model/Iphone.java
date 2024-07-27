package io.github.renanrcs.poo_uml.domain.model;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser{
    @Override
    public String displayPage(String url) {
        return "Exibindo página: " + url;
    }

    @Override
    public String openNewTab() {
        return "Nova aba adicionada.";
    }

    @Override
    public String refreshPage() {
        return "Página atualizada.";
    }

    @Override
    public String play() {
        return "Reproduzindo música...";
    }

    @Override
    public String pause() {
        return "Música pausada.";
    }

    @Override
    public String selectSong(String song) {
        return "Música selecionada: " + song;
    }

    @Override
    public String call(String number) {
        return "Ligando para: " + number;
    }

    @Override
    public String answer() {
        return "Atendendo chamada.";
    }

    @Override
    public String startVoicemail() {
        return "Iniciando correio de voz.";
    }
}

package io.github.renanrcs.poo_uml.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class IphoneTest {

    Iphone iphone;

    @BeforeEach
    void setUp() {
        iphone = new Iphone();
    }

    @Test
    @DisplayName("Testando carregamento de página")
    void testDisplayPage_When_Url_IsCorrect() {
        // Arrange
        String url = "https://github.com/renanrcs";
        String expected = String.join("", "Exibindo página: ", url);

        // Act
        String msgReturned = iphone.displayPage(url);

        // Assert
        assertEquals(expected, msgReturned, () -> msgReturned + " is not equal " + expected);
    }

    @Test
    @DisplayName("Testando abertura de nova página")
    void openNewTab() {
        // Arrange
        String expected = "Nova aba adicionada.";

        // Act
        String msgReturned = iphone.openNewTab();

        // Assert
        assertEquals(expected, msgReturned);
    }

    @Test
    @DisplayName("Testando reload da página")
    void refreshPage() {
        // Given
        String expected = "Página atualizada.";

        // When
        String actual = iphone.refreshPage();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testando não reload da página")
    void test_RefreshPage_When_NotReload() {
        // Given
        String unexpected = "Página";

        // When
        String actual = iphone.refreshPage();

        // Then
        assertNotEquals(unexpected, actual);
    }

    @Test
    void play() {
        // Given
        String expected = "Reproduzindo música...";

        // When
        String actual = iphone.play();

        // Then
        assertEquals(expected, actual, () -> actual + " is not equal " + expected);
    }

    @Test
    void pause() {
        // Arrange
        String expected = "Música pausada.";

        // Act
        String actual = iphone.pause();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void selectSong() {
        // Given
        String song = "Melhor música";
        String expected = String.join("", "Música selecionada: " + song);

        // When
        String actual = iphone.selectSong(song);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void call() {
        // Arrange
        String number = "555";
        String expected = String.join("", "Ligando para: " + number);

        // Act
        String call = iphone.call(number);

        // Assert
        assertEquals(expected, call);
    }

    @Test
    void answer() {
        // Given
        String expected = "Atendendo chamada.";

        //When
        String answer = iphone.answer();

        // Then
        assertEquals(expected, answer);
    }

    @Test
    void startVoicemail() {
        // Arrange
        String expected = "Iniciando correio de voz.";

        // Act
        String actual = iphone.startVoicemail();

        // Assert
        assertEquals(expected, actual, () -> actual + " is not equal " + expected);
    }
}
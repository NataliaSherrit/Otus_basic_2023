package homework_18.tests;

import homework_18.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class GameTests {

    // тест должен упасть, так как не обработан результат игры при выпадении одинаковых значений кубиков
    @Test
    void checkWinnerIfDraw(){
        Dice dice = new DiceDrawMock();
        GameWinnerPrinterTestImpl winnerPrinter = new GameWinnerPrinterTestImpl();

        PrintStream firstString = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream lastString = new PrintStream(byteArrayOutputStream);

        System.setOut(lastString);

        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
        String result = byteArrayOutputStream.toString();
        System.setOut(firstString);
        Assertions.assertEquals("Ничья", result);
    }

    @Test
    void checkCorrectWinner(){
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        Dice dice = new DiceMock();
        GameWinnerPrinterTestImpl winnerPrinter = new GameWinnerPrinterTestImpl();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(player1, player2);
        Assertions.assertEquals(player1, winnerPrinter.getWinnerPlayer());
    }

    @Test
    void checkWinnerExists(){
        Player player1 = null;
        Player player2 = new Player("Петя");
        Dice dice = new DiceMock();
        GameWinnerPrinterTestImpl winnerPrinter = new GameWinnerPrinterTestImpl();
        Game game = new Game(dice, winnerPrinter);
        Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {game.playGame(player1, player2);});
        Assertions.assertTrue(exception.getMessage().contains("is null"));

    }
}

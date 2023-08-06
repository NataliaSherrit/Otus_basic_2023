package homework_18.tests;

import homework_18.game.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTests {

    // тест должен упасть, так как не обработан результат игры при выпадении одинаковых значений кубиков
    @Test
    void checkWinnerIfDraw(){
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        String result = game.playTestGame(new Player("Вася"), new Player("Игорь"), 1,1);
        Assertions.assertEquals(null, result);
    }

    @Test
    void checkCorrectWinner(){
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        String result = game.playTestGame(new Player("Вася"), new Player("Игорь"), 2,4);
        Assertions.assertEquals("Игорь", result);
    }

    @Test
    void checkWinnerExists(){
        Player player1 = new Player("Петя");
        Player player2 = null;
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        Exception exception = Assertions.assertThrows(NullPointerException.class, () -> {game.playTestGame(player1, player2, 2,4);});
        Assertions.assertTrue(exception.getMessage().contains("\"winner\" is null"));

    }
}

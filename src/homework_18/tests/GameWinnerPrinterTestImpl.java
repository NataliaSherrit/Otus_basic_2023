package homework_18.tests;

import homework_18.game.GameWinnerPrinter;
import homework_18.game.Player;

import java.util.Objects;

public class GameWinnerPrinterTestImpl implements GameWinnerPrinter {
    private Player winnerPlayer;

    @Override
    public void printWinner(Player winner) {
        winnerPlayer = winner;
        System.out.printf("Победитель: %s%n", winnerPlayer.getName());
    }

    public Player getWinnerPlayer() {
        return winnerPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameWinnerPrinterTestImpl that = (GameWinnerPrinterTestImpl) o;
        return Objects.equals(winnerPlayer, that.winnerPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winnerPlayer);
    }
}

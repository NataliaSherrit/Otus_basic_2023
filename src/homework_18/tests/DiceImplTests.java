package homework_18.tests;


import homework_18.game.DiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceImplTests {

    // тест должен упасть, т.к не заданы границы рандомайзера
    @Test
    void correctResultOfRollDice() {
        int result = new DiceImpl().roll();
        Assertions.assertTrue(result<=6 && result>=1, "Результатом броска кубика может быть значение от 1 до 6, результат броска " + result);
    }

}

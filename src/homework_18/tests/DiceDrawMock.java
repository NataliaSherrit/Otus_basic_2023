package homework_18.tests;

import homework_18.game.Dice;

public class DiceDrawMock implements Dice {

    @Override
    public int roll() {
        return 2;
    }

}

package homework_18.tests;

import homework_18.game.Dice;

public class DiceMock implements Dice {

    private int max = 6;

    @Override
    public int roll() {
        max--;
        return max;
    }


}

package homework_14;

import java.util.Scanner;

import static homework_14.CandyBox.*;

public class PresentsCalculator {
    private static int childrenCount;
    private static int presentsCount;

    public static void main(String[] args) throws Exception {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество подарков: ");
        presentsCount = scanner.nextInt();
        System.out.println("Введите количество детей: ");
        childrenCount = scanner.nextInt();
        if (childrenCount == 0) {
            throw new IllegalArgumentException("Детей не может быть 0");
        } else {
            result = getPresentsCountForOneChild(childrenCount, presentsCount);
            getPresentBox(result);
        }

    }
    private static CandyBox getPresentBox (int count) throws Exception {
        try (CandyBox candyBox = new CandyBox(0);){
            candyBox.setPresentsCount(count);
            if (count ==0) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Нельзя подарить детям 0 подарков");
        }
        return new CandyBox(count);
    }

    private static int getPresentsCountForOneChild (int childrenCount, int presentsCount ) throws PresentException {
        int result = presentsCount % childrenCount;
        if (result != 0) {
        throw new PresentException();
    }
        return presentsCount / childrenCount;
    }
}

package homework_14;

import java.util.Scanner;

public class presentsCalculator {
    private static int childrenCount;
    private static int presentsCount;

    public static void main(String[] args) throws PresentException {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество подарков: ");
        presentsCount = scanner.nextInt();
        System.out.println("Введите количество детей: ");
        childrenCount = scanner.nextInt();
        if (childrenCount == 0) {
            throw new NullPointerException("Детей не может быть 0");
        } else {
            result = getPresentsCountForOneChild(childrenCount, presentsCount);
            getPresentBox(result);
        }

    }
    private static CandyBox getPresentBox (int count) {
        CandyBox candyBox = new CandyBox(0);
        try {
            candyBox.setPresentsCount(count);
            if (count ==0) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Нельзя подарить детям 0 подарков");
        }
        finally {
            CandyBox.wrapUpBox(count);
        }
        return  candyBox.setPresentsCount(count);
    }

    private static int getPresentsCountForOneChild (int childrenCount, int presentsCount ) throws PresentException {
        int result = presentsCount % childrenCount;
        if (result != 0) {
        throw new PresentException();
    }
        return presentsCount / childrenCount;
    }
}

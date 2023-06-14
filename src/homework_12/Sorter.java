package homework_12;

import java.util.*;

public class Sorter {

    public static void main(String[] args) {
        Integer [] arrayForSort = new Integer[100];
        Integer [] arrayForList = new Integer[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            arrayForSort[i] = random.nextInt(100);
            arrayForList[i] = random.nextInt(100);
        }
        List <Integer> listForSort = Arrays.asList(arrayForList);
        System.out.println(listForSort);
        long startTimeSort = System.nanoTime();
        Collections.sort(listForSort);
        long resultTimeSort = System.nanoTime() - startTimeSort;
        System.out.println(resultTimeSort);

        System.out.println(Arrays.toString(arrayForSort));
        long startTimeBubble = System.nanoTime();
        bubbleSort(arrayForSort);
        long resultTimeBubble = System.nanoTime() - startTimeBubble;
        System.out.println(resultTimeBubble);
    }

    public static void bubbleSort(Integer[] array) {
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    }

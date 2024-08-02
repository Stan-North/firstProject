package homework2;

import homework2.office.Office;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("_____________________");
        ex2();
        System.out.println("_____________________");
        ex3();
        System.out.println("_____________________");
        ex5();
    }

    public static void ex1() {
        //Дан массив со словами
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String resultText = "";
        for (int i = 0; i < words.length; i++) {
            resultText += words[i] + "-";
        }
        resultText = resultText.substring(0, resultText.length() - 1);
        System.out.println(resultText);


        //С помощью циклов и функции String.substring составить итоговый текст
        //Это-шашлык-на-шампуре
    }

    public static void ex2() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftDownToRightUpSum += arrayOfNumbers[(arrayOfNumbers.length - 1) - i][i];
        }
        System.out.println(leftUpToRightDownSum);
        System.out.println(leftDownToRightUpSum);
    }

    public static void ex3() {
        Random random = new Random(1);
        int counter = 0;
        while (true) {
            int number = random.nextInt(1000);
            counter++;
            if (number == 999) {
                System.out.println(counter);
                return;
            }
        }
    }

    public static void ex4() {
    }

    /**
     * Для продвинутых
     */
    public static void ex5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int element : numbers){
            System.out.println(element);
        }
    }
}

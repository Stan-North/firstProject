package homework1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstDigit = Double.parseDouble(scanner.nextLine());

        System.out.println("ведите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String symbol = scanner.nextLine();

        System.out.println("Введите второе число");
        double secondDigit = scanner.nextDouble();

        if (symbol.equals("+")){
            System.out.println(firstDigit + secondDigit);
        } else if (symbol.equals("-")) {
            System.out.println(firstDigit - secondDigit);
        } else if (symbol.equals("*")) {
            System.out.println(firstDigit * secondDigit);
        } else if (symbol.equals("/")) {
            System.out.println(firstDigit / secondDigit);
        }else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
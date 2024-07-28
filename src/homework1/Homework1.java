package homework1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.trim();
        if (name.contains("ова ")){
            System.out.println("Уважаемая " + name.toUpperCase());
        } else if (name.contains("ов ")) {
            System.out.println("Уважаемый " + name.toUpperCase());
        }else {
            System.out.println("Неизвестное лицо " + name.toUpperCase());
        }
    }

    public static void ex3() {
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        &&  (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are");
        int firstIndex = simply.indexOf('o');
        int secondIndex = simply.indexOf('o', firstIndex+1);
        System.out.println(secondIndex);
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
        incomeAfterTaxes(2000,8511,6988);
    }

    public static void incomeAfterTaxes(int sausageQtty, int hamQtty, int neckQtty){
        int sausagePrice = 800;
        int sasuageResultCost;

        if (sausageQtty < 1000){
            sasuageResultCost = 412;
        } else if ((sausageQtty > 1000) && (sausageQtty < 2000)) {
            sasuageResultCost = 408;
        }else {
            sasuageResultCost = 404;
        }

        int hamPrice = 350;
        int hamResultCost = 275;

        int neckPrice = 500;
        int neckResultCost;

        if (neckQtty < 500){
            neckResultCost = 311;
        }else {
            neckResultCost = 299;
        }

        //Доход компании
        BigDecimal companyIncome = BigDecimal.valueOf(
                ((long)sausageQtty * sausagePrice)
                + ((long)hamQtty * hamPrice)
                + ((long)neckQtty * neckPrice));
        System.out.println("Доход компании: " + companyIncome);

        //Расход компании (умножение себестоимости на количество проданных кг + миллион рублей)
        BigDecimal companyExpenses = BigDecimal.valueOf(
                ((long)sausageQtty * sasuageResultCost)
                + ((long)hamQtty * hamResultCost)
                + ((long)neckQtty * neckResultCost)
                + 1_000_000L);
        System.out.println("Расход компании: " + companyExpenses);

        //Прибыль до налогов
        BigDecimal incomeBeforeTaxes = companyIncome.subtract(companyExpenses);
        System.out.println("Прибыль компании до налогов: " + incomeBeforeTaxes);

        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
        // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
        BigDecimal taxes;
        BigDecimal upperLimit = BigDecimal.valueOf(2000000L);
        BigDecimal lowerLimit = BigDecimal.valueOf(1000000L);
        if (incomeBeforeTaxes.compareTo(upperLimit) > 0){
            taxes = BigDecimal.valueOf(13L).multiply(incomeBeforeTaxes);
            taxes = taxes.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        } else if ((incomeBeforeTaxes.compareTo(lowerLimit) > 0) && (incomeBeforeTaxes.compareTo(upperLimit) < 0)) {
            taxes = BigDecimal.valueOf(10L).multiply(incomeBeforeTaxes);
            taxes = taxes.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        }else {
            taxes = BigDecimal.valueOf(8L).multiply(incomeBeforeTaxes);
            taxes = taxes.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        }
        System.out.println("Сумма налога: " + taxes);

        //Доходы после налогов
        BigDecimal incomeAfterTaxes = incomeBeforeTaxes.subtract(taxes);
        System.out.println("Прибыль после налогов: " + incomeAfterTaxes);
    }
}
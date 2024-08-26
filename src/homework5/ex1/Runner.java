package homework5.ex1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        String[] countries = {CountriesEnum.RUSSIA.getName(), CountriesEnum.FRANCE.getName(),
                CountriesEnum.CHINA.getName(), CountriesEnum.JAPAN.getName(), CountriesEnum.TURKEY.getName()};

        String filename = "donation.csv";

        BigDecimal donationsFromRussia = BigDecimal.ZERO;
        BigDecimal donationFromFrance = BigDecimal.ZERO;
        BigDecimal donationFromChina = BigDecimal.ZERO;
        BigDecimal donationFromJapan = BigDecimal.ZERO;
        BigDecimal donationFromTurkey = BigDecimal.ZERO;

        Scanner scanner = new Scanner(homework5.ex1.Runner.class.getClassLoader().getResourceAsStream(filename));

        while (scanner.hasNextLine()) {
            String[] donationData = separateLine(scanner.nextLine());
            String country = getCountry(donationData);
            BigDecimal donationValue = BigDecimal.ZERO;
            try {
                donationValue = getDonationValue(donationData);
            } catch (NumberFormatException e) {
                e.getMessage();
            }

            if (country.equals(CountriesEnum.RUSSIA.getName())) {
                donationsFromRussia = donationsFromRussia.add(donationValue);
            } else if (country.equals(CountriesEnum.FRANCE.getName())) {
                donationFromFrance = donationFromFrance.add(donationValue);
            } else if (country.equals(CountriesEnum.CHINA.getName())) {
                donationFromChina = donationFromChina.add(donationValue);
            } else if (country.equals(CountriesEnum.JAPAN.getName())) {
                donationFromJapan = donationFromJapan.add(donationValue);
            } else if (country.equals(CountriesEnum.TURKEY.getName())) {
                donationFromTurkey = donationFromTurkey.add(donationValue);
            }
        }
        scanner.close();

        BigDecimal[] donationSumPerCountry = createValuesArray(donationsFromRussia, donationFromFrance,
                donationFromChina, donationFromJapan, donationFromTurkey);

        printStatistics(countries, donationSumPerCountry);
    }

    //делим строку
    public static String[] separateLine(String line) {
        return line.split(";");
    }

    //парсим название страны
    public static String getCountry(String[] splittedLine) {
        return splittedLine[0];
    }

    //парсим значение доната
    public static BigDecimal getDonationValue(String[] splittedLine) throws NumberFormatException {
        double value = Double.parseDouble(splittedLine[1].replace(",", "."));
        return BigDecimal.valueOf(value);
    }

    //заносим значения донатов в массив
    public static BigDecimal[] createValuesArray(BigDecimal russiaValue, BigDecimal franceValue,
                                             BigDecimal chinaValue, BigDecimal japanValue, BigDecimal turkeyValue) {
        return new BigDecimal[]{russiaValue, franceValue, chinaValue, japanValue, turkeyValue};
    }

    //вывод статистики в консоль
    public static void printStatistics(String[] countries, BigDecimal[] values) {
        System.out.println("Список пожертвований по странам:");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] + " - " + values[i]);
        }
    }
}
    //Донаты со всего мира
    //Одному блогеру присылают пожертвования(донаты) за его ролики
    //Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
    //Необходимо посчитать сумму пожертвований от пользователей из каждой страны
    //Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)

    //Чтение файла из папки resources (без привязки к конкретному расположению проекта)

    //Ожидаемый вывод:
    //Список пожертвований по странам (пример):
    //Россия - 14233.00
    //Франция - 8000.32
    //Китай - 20000.11
    //Япония - 124.10
    //Турция - 777.55


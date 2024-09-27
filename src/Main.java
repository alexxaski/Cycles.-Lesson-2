public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " , сумма " +
                    "накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            year++;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + " , численность" +
                    " населения составляет " + population);
        }

        System.out.println("Задача 4");
        int monthB = 0;
        int salaryB = 15000;
        int totalB = 0;
        while (totalB <= 12_000_000) {
            totalB = totalB + totalB * 7 / 100;
            totalB = totalB + salaryB;
            monthB++;
            System.out.println("Месяц " + monthB + " , сумма " +
                    "накоплений равна " + totalB + " рублей");

        }
        System.out.println("Задача 5");

        int monthB6 = 0;
        int salaryB6 = 15000;
        int totalB6 = 0;

        while (totalB6 <= 12_000_000) {
            totalB6 = totalB6 + totalB6 * 7 / 100;
            totalB6 = totalB6 + salaryB6;
            monthB6++;
            if (monthB6 % 6 == 0) {
                System.out.println("Месяц " + monthB6 + " , сумма " +
                        "накоплений равна " + totalB6 + " рублей");
            }
        }

        System.out.println("Задача 6");
        int monthB9 = 0;
        int salaryB9 = 15000;
        int totalB9 = 0;
        while (monthB9 <= 108 ) {
            totalB9 = totalB9 + totalB9 * 7 / 100;
            totalB9 = totalB9 + salaryB9;
            monthB9++;
                    if (monthB9 % 6 == 0) {
                    System.out.println("Cумма накоплений" +
                            " каждые пол года равна " + totalB9 + " рублей");
                }
            }

            System.out.println("Задача 7");

        for (int day = 6; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница," + day+"-е число. " +
                    "Необходимо подготовить отчет");
        }

            System.out.println("Задача 8");
        int yearComet = 2017 ;
        int before = yearComet - 200 ;
        int after = yearComet + 100 ;
        while ( before < after ) {
                System.out.println(before + "год прилета кометы");
            before = before + 79 ;
        }

            System.out.println("THE END");
        }
    }
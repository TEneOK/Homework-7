public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("-=-=-Task_1-=-=-");
        int drop = 15000;
        int jar = 0;
        int i = 0;
        while (jar <= 2460000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + jar + " рублей");
            jar = jar + drop;
            i++;
        }
        //task2
        System.out.println("-=-=-Task_2-=-=-");
        int a = 1;
        while (a < 11) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
        //task3
        System.out.println("-=-=-Task_3-=-=-");
        long y = 12000000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;
        double growthRate = birthRate - deathRate;

        for (int year = 1; year <= 10; year++) {
            y *= (year + growthRate);
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }
        //task4
        System.out.println("-=-=-Task_4-=-=-");
        int save = 15000;
        double percent = 0.07;
        int months = 0;

        for (; save <= 12_000_000; months++) {
            System.out.println(months + " месяцев Василию нужно будет копить, чтобы собрать сумму в " + save +
                    " миллионов рублей");
            save *= (1 + percent);
        }
        //task5
        System.out.println("-=-=-Task_5-=-=-");
        int saveTwo = 15000;
        double percentTwo = 0.07;
        int monthsTwo = 0;

        for (; saveTwo <= 12_000_000; monthsTwo++) {
            saveTwo *= (1 + percentTwo);
            if (saveTwo % 6 == 0) {
                System.out.println(monthsTwo + " месяцев Василию нужно будет копить, чтобы собрать сумму в " + saveTwo +
                        " миллионов рублей");
            }
        }
        //task6
        System.out.println("-=-=-Task_6-=-=-");
        int newSave = 15000;
        double oldPercent = 0.07;
        for (i = 0; i < 109; i++) {
            newSave *= (1 + oldPercent);
            if (newSave % 6 == 0) {
                System.out.println(i + " месяц у него сумма " + newSave);
            }
        }
        //task7
        System.out.println("-=-=-Task_7-=-=-");
        int firstFriday = 9;
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
        //task8
        System.out.println("-=-=-Task_8-=-=-");
        int nowYears = 2059;
        int startInterval = nowYears - 200;
        int finishInterval = nowYears + 100;
        int period = 79;
        for (int year = startInterval; year < finishInterval; year+= period) {
            if (year > startInterval && year < finishInterval){
                System.out.println(year);
            }
        }
    }
}
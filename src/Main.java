public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.print("\n");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Задание 2


        for (i = 4; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.print("\n");

        //Задание 3

        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = start; year < end; year++) {
            if (i % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}
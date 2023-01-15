public class Main {
    public static void main(String[] args) {
        hw6();
    }
    public static void hw6() {
//Задание 1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
//Задание 2
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
//Задание 3
        System.out.println("\nTask 3");
        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);
        }
//Задание 4
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
//Задание 5
        System.out.println("\nTask 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
                System.out.println(year + " високосный год");
            }
        }
//Задание 6
        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
//Задание 7
        System.out.println("\nTask 7");
        for(int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
//Задание 8
        System.out.println("\nTask 8");
        int part = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
//Задание 9
        System.out.println("\nTask 9");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
//Задание 10
        System.out.println("\nTask 10");
        for (int i = 1; i <= 10; i++) {
            int result = i * 2;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}
public class Main {
    public static void checkYear(int y) {
        boolean isLeapYear = y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
        if (isLeapYear) {
            System.out.println(y + " год является високосным");
        }
        else {
            System.out.println(y + " год не является високосным");
        }
    }

    public static void checkDevice(int x, int y) {
        if (y < 2015 && x == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (y < 2015 && x == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (y >= 2015 && x == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (y >= 2015 && x == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculateDelivery(int d) {
        int deliveryDays = 0;
        if (d < 20) {
            deliveryDays = 1;
        } else if (d >=20 && d < 60) {
            deliveryDays = 2;
        } else if (d >=60 && d < 100) {
            deliveryDays = 3;
        }
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
    public static void main(String[] args) {

//        Задача 1
        System.out.println("\nЗадача 1:\n");
        int year = 2021;
        checkYear(year);

//        Задача 2
        System.out.println("\nЗадача 2:\n");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkDevice(clientOS, clientDeviceYear);

//        Задача 3
        System.out.println("\nЗадача 3:\n");
        int deliveryDistance = 100;
        calculateDelivery(deliveryDistance);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1"); // Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("задание 2"); // Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        if (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        System.out.println("задание 3"); // Задание 3
        int year = 2021; // Какой год
        int del4 = year % 4; // Делим на 4
        int del100 = year % 100; // Делим на 100
        boolean vi = year > 1584 && del4 == 0 && del100 > 0;
        if (year >= 1584 && del4 == 0 && del100 > 0){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год невисокосный");
        }
        System.out.println("задание 4"); // Задание 4
        int deliveryDistance = 95;
        int minTimeDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + minTimeDelivery);
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (minTimeDelivery+1));
        }else{
            System.out.println("Потребуется дней: " + (minTimeDelivery+2));
        }
        System.out.println("задание 5"); // Задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
            System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
            System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
            System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
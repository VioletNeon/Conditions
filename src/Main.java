public class Main {
    public static void main(String[] args) {
        short clientOS = 0;
        boolean isAndroid = clientOS == 1;
        boolean isIOS = clientOS == 0;

        if (isAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short conditionalYear = 2015;
        short clientDeviceYear = 2015;
        boolean isBeforeConditionalYear = clientDeviceYear < conditionalYear;

        if (isAndroid && isBeforeConditionalYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (isAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (isIOS && isBeforeConditionalYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (isIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short startLeapYear = 1584;
        short year = 2021;
        short yearsDifference = (short) (year - startLeapYear);

        boolean isForthYear = yearsDifference % 4 == 0;
        boolean isHundredYear = yearsDifference % 100 == 0;
        boolean isFourthHundredYear = yearsDifference % 400 == 0;
        boolean isLeapYear = isFourthHundredYear || (!isHundredYear && isForthYear);

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        byte deliveryDistance = 95;
        boolean isLessZeroKM = deliveryDistance < 20;
        boolean isBetweenTwentyAndSixtyKM = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean isBetweenSixtyAndOneHundredKM = deliveryDistance > 60 && deliveryDistance <= 100;
        boolean isMoreThanOneHundredKM = deliveryDistance > 100;

        if (isLessZeroKM) {
            System.out.println("Потребуется дней: " + 1 + " для доставки на расстояние: " + deliveryDistance + " км");
        } else if (isBetweenTwentyAndSixtyKM) {
            System.out.println("Потребуется дней: " + 2 + " для доставки на расстояние: " + deliveryDistance + " км");
        } else if (isBetweenSixtyAndOneHundredKM) {
            System.out.println("Потребуется дней: " + 3 + " для доставки на расстояние: " + deliveryDistance + " км");
        } else if (isMoreThanOneHundredKM) {
            System.out.println("Доставки на расстояние: " + deliveryDistance + " км - нет");
        }

        byte monthNumber = 13;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц" + " - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц" + " - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц" + " - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц" + " - это осень");
                break;
            default:
                System.out.println(monthNumber + " - такого месяца не существует");
        }

    }
}
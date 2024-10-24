public class Main {
    public static void main(String[] args) {
        byte logFalse = 0;
        byte logTrue = 1;
        short clientOS = getRandomNumber(logFalse, logTrue);
        boolean isAndroid = clientOS == 1;
        boolean isIOS = clientOS == 0;

        if (isAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (isIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short maxDeviceYear = 2024;
        short minDeviceYear = 2005;
        short conditionalYear = 2015;
        short clientDeviceYear = getRandomNumber(minDeviceYear, maxDeviceYear);
        boolean isBeforeConditionalYear = clientDeviceYear < conditionalYear;

        if (isAndroid) {
            if (isBeforeConditionalYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (isIOS) {
            if (isBeforeConditionalYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        short startLeapYear = 1584;
        short minYear = 1584;
        short maxYear = 2030;

        short randomYear = getRandomNumber(minYear, maxYear);
        short yearsDifference = (short) (randomYear - startLeapYear);

        boolean isForthYear = yearsDifference % 4 == 0;
        boolean isHundredYear = yearsDifference % 100 == 0;
        boolean isFourthHundredYear = yearsDifference % 400 == 0;
        boolean isLeapYear = isFourthHundredYear || (!isHundredYear && isForthYear);

        if (isLeapYear) {
            System.out.println(randomYear + " год является високосным");
        } else {
            System.out.println(randomYear + " год не является високосным");
        }


        byte minDistance = 1;
        byte maxDistance = 127;
        byte deliveryDistance = (byte) getRandomNumber(minDistance, maxDistance);
        byte deliveryTime = 0;
        boolean isMoreZeroKM = deliveryDistance > 0;
        boolean isMoreThanTwentyKM = deliveryDistance > 20;
        boolean isMoreThanSixtyKM = deliveryDistance > 60;
        boolean isMoreThanOneHundredKM = deliveryDistance > 100;

        if (isMoreZeroKM) {
            ++deliveryTime;
        }

        if (isMoreThanTwentyKM) {
            ++deliveryTime;
        }

        if (isMoreThanSixtyKM) {
            ++deliveryTime;
        }

        if (isMoreThanOneHundredKM) {
            System.out.println("Доставки на расстояние: " + deliveryDistance + " км - нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime + " для доставки на расстояние: " + deliveryDistance + " км");
        }

        byte minMonth = 1;
        byte maxMonth = 15;
        byte monthNumber = (byte) getRandomNumber(minMonth, maxMonth);

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

    public static short getRandomNumber(short min, short max) {
        return (short) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}
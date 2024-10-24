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
    }

    public static short getRandomNumber(short min, short max) {
        return (short) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}
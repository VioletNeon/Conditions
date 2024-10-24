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

        short maxYear = 2024;
        short minYear = 2005;
        short conditionalYear = 2015;
        short clientDeviceYear = getRandomNumber(minYear, maxYear);
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
    }

    public static short getRandomNumber(short min, short max) {
        return (short) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}
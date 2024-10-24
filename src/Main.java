public class Main {
    public static void main(String[] args) {
        byte logFalse = 0;
        byte logTrue = 1;
        byte clientOS = getRandomNumber(logFalse, logTrue);
        boolean isAndroid = clientOS == 1;
        boolean isIOS = clientOS == 0;

        if (isAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (isIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static byte getRandomNumber(byte min, byte max) {
        return (byte) (Math.floor((float) Math.random() * (max - min + 1)) + min);
    }
}
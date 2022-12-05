import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int amountOfDays = 31;
        int[] arr = generateRandomArray();
        int sum = Arrays.stream(arr).sum();
        System.out.println("Сумма затрат в месяц составила " + sum);
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
        double mean = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--){
                System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
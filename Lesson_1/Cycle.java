public class Cycle { 

    public static void main(String[] agrs) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int k = 6;
        while (k != -8) {
            System.out.println(k);
            k -= 2;
        }

        int sum = 0;
        int number = 10;
        do {
            if (number % 2 != 0) {
                sum = number + sum;
            }
            number++;
        } while (number != 20);
        System.out.println(sum);
    }
}
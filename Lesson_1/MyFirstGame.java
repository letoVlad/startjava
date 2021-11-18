public class MyFirstGame { 

    public static void main(String[] agrs) {
        int minNumber = 0;
        int maxNumber = 100;
        int key = 27;
        int mid = 0;

        while (minNumber <= maxNumber) {
            mid = (minNumber + maxNumber) / 2;
            if (mid == key) {
                System.out.println(mid + " Поздравляю, число угадано!");
                break;
            } else if (mid < key) {
                minNumber = mid + 1;
                System.out.println(mid + " Данное число меньше того, что загадал компьютер");
            } else if (mid > key) {
                maxNumber = mid - 1;
                System.out.println(mid + " Данное число больше того, что загадал компьютер");
            }
        }
    }
}
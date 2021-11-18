public class MyFirstGame { 

    public static void main(String[] agrs) {
        int startRate = 0;
        int endRate = 100;
        int hiddenNumberComp = 27;
        int hiddenNumberUser = 0;

        while (startRate <= endRate) {
            hiddenNumberUser = (startRate + endRate) / 2;
            if (hiddenNumberUser == hiddenNumberComp) {                
                break;
            } else if (hiddenNumberUser < hiddenNumberComp) {
                startRate = hiddenNumberUser + 1;
                System.out.println(hiddenNumberUser + " Данное число меньше того, что загадал компьютер");
            } else if (hiddenNumberUser > hiddenNumberComp) {
                endRate = hiddenNumberUser - 1;
                System.out.println(hiddenNumberUser + " Данное число больше того, что загадал компьютер");
            }
        }
		System.out.println(hiddenNumberUser + " Поздравляю, число угадано!");
    }
}
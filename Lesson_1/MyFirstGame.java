public class MyFirstGame { 

    public static void main(String[] agrs) {
        int startRate = 0;
        int endRate = 100;
        int hiddenNumberComp = 27;
        int hiddenNumber = 0;

        while (hiddenNumber != hiddenNumberComp) {
            hiddenNumber = (startRate + endRate) / 2;
            if (hiddenNumber == hiddenNumberComp) {                
                break;
            } else if (hiddenNumber < hiddenNumberComp) {
                startRate = hiddenNumber;
                System.out.println(hiddenNumber + " Данное число меньше того, что загадал компьютер");
            } else if (hiddenNumber > hiddenNumberComp) {
                endRate = hiddenNumber;
                System.out.println(hiddenNumber + " Данное число больше того, что загадал компьютер");
            }
        }
		System.out.println(hiddenNumber + " Поздравляю, число угадано!");
    }
}

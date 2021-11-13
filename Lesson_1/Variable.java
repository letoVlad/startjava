public class Variable {   
    public static void main(String[] args) {
        byte directx = 12;
        short swapFile = 10866;
        int memory = 16384;
        long hardMemory = 3_563_530_359L;
        float clockRate = 4.10f;
        double voltage = 1.324;
        char temperature = 'C';
        boolean included = true;

        System.out.print(directx + " " + swapFile + " " + memory + " " + hardMemory + " " + clockRate
                + " " + voltage + " " + temperature + " " + included);
    }
}
public class WolfTest  {   
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "Female";
        wolfOne.age = 1;
        wolfOne.weight = 27;
        System.out.println("Кличка волчка " + wolfOne.alias);
        System.out.println("Волчку теперь " + wolfOne.age + " лет");
        System.out.println("Вес волка = " + wolfOne.weight);
        wolfOne.run();
        wolfOne.sit();
        wolfOne.hunt();
        wolfOne.howl();
        wolfOne.go();
    }
}

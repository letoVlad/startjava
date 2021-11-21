public class WolfTest  {   
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        // wolfOne.sex = "Female";
        // wolfOne.age = 1;
        // wolfOne.weight = 27;
        // System.out.println("Кличка волчка " + wolfOne.alias);
        // System.out.println("Волчку теперь " + wolfOne.age + " лет");
        // System.out.println("Вес волка = " + wolfOne.weight);
        wolfOne.run();
        wolfOne.sit();
        wolfOne.hunt();
        wolfOne.howl();
        wolfOne.go();
        // Новые значения
        wolfOne.setAlias("Black");
        wolfOne.setAge(5);
        wolfOne.setColor("White");
        wolfOne.setWeight(30);
        System.out.println(wolfOne.getAlias());
        System.out.println(wolfOne.getAge());
        wolfOne.setAge(123);
        System.out.println(wolfOne.getColor());
        System.out.println(wolfOne.getWeight());
    }
}

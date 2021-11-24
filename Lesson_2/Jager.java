public class Jager {
    private String modelName = "";
    private String origin = "";
    private int height = 0;
    private int speed = 0;
    private int armor = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("moving");
    }

    public void rockets() {
        System.out.println("Запуск ракет со спины");
    }

    public String pulse() {
        return "pulse trigger";
    }
}
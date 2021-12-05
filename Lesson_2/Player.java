public class Player {
    String name;
    int number;

    public Player(String name) {
        this.name = name;
    }

    public String getNamePlayer() {
        return name;
    }

    public int getHiddenNumberUser() {
        return number;
    }

    public void setHiddenNumberUser(int number) {
        this.number = number;
    }
}
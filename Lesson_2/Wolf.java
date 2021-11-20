public class Wolf{

    String sex = "Male";
    String alias = "Серый";
    int weight = 33;
    int age = 5;
    String color = "Серый";

    void go() {
        System.out.println(alias + " идет бредет");
    }

    void sit() {
        System.out.println(alias + " присел на дорожку");
    }

    void run() {
        System.out.println(alias + " бежит за добычей");
    }

    void howl() {
        System.out.println(alias + " воет на луну");
    }

    void hunt() {
        System.out.println(alias + " выслеживает добычу");
    }
}
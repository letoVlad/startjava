public class ConditionalStatement  {   
    public static void main(String[] args) {
        int ears = 30;
        boolean isMaleSex = true;
        double height = 1.95;
        char firstLetterName = 'M';
        
        if(ears > 20) {
            System.out.println("Мне больше 20");
        }

        if(isMaleSex) {
            System.out.println("Я все ещё мужчина");
        }

        if(isMaleSex != false) {
            System.out.println("Я уже не мужчина");
        }

        if(height < 1.80) {
            System.out.println("Мой рост меньше 1.80");
        } else {
            System.out.println("Мой рост больше 1.80");
        }

        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая бува имени I");
        } else {
            System.out.println("имя c неизвестной буквой");
        }
    }
}
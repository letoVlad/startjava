public class ConditionalStatement  {   
    
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("Мне больше 20");
        }

        boolean isMale = true;
        if(isMale) {
            System.out.println("Я все ещё мужчина");
        }
		
		isMale = false;
        if(!isMale) {
            System.out.println("Я уже не мужчина");
        }

        double height = 1.95;
        if(height < 1.80) {
            System.out.println("Мой рост меньше 1.80");
        } else {
            System.out.println("Мой рост больше 1.80");
        }

        char firstLetterName = 'M';
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая бува имени I");
        } else {
            System.out.println("имя c неизвестной буквой");
        }
    }
}
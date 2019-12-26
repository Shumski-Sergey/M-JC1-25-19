package a.mitsura;

public class random {
    public static void main(String[] args) {
        int a = 5, b = 155;
        int random = a + (int) (Math.random() * b);
        System.out.println("Первое рандмное: " + random);
        if (random >= 26&&random <= 99) {
            System.out.println("все норм");
        }
        else{System.out.println("дерьмо");}
    }
}
import java.util.Scanner;

public class Lab4_1b_arrays {
    /*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.nextLine();
        char[] nText = text.toCharArray(); //перевод string в массив типа char

        char[] sings = {'.', ',', '?', '!', ';', ':', '-', '"', '(', ')'};
        int sum = 0;
        for (int i = 0; i < nText.length; i++) {
            for (int j = 0; j < sings.length; j++) {
                if (nText[i]==sings[j]){
                    System.out.print(sings[j]+ " ");
                    sum++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Number of punctuation marks: " + sum);
    }
}

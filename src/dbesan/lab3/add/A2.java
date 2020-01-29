package dbesan.lab3.add;

public class A2 {
    /**
     * последовательности
     **/
    public static void main(String[] args) {
        int numb = 1;
        int tempnumb = 1;
        int count = 0;
        for (int i = 0; i < 55; i++) {
            tempnumb = tempnumb + 2;
            count++;
        }
        int[] numbArr = new int[count];   //Просто циклом было бы проще
        for (int i = 0; i < numbArr.length; i++) {
            numbArr[i] = numb;

            System.out.println(numbArr[i]);
            numb = numb + 2;
        }
    }
}
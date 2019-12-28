package dbesan.lab3.add;

public class A1 {

    public static void main(String[] args) {
        int numb = 1000;
        int tempnumb = 1000;
        int count = 0;
        for ( int i = 0; tempnumb<10000; i++)
        {
        tempnumb=tempnumb+3;
        count++;
        }
        int [] numbArr = new int[count];   //Просто циклом было бы проще
        for(int i = 0; i<numbArr.length;i++)

        {
        numbArr[i] = numb;

        System.out.println(numbArr[i]);
            numb = numb+3;
        }
    }
    }
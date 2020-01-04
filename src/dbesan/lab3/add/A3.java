package dbesan.lab3.add;

public class A3 {
    /** последовательности **/
    public static void main(String[] args) {
        int numb = 90;
        int tempnumb = 90;
        int count = 0;
        for ( int i = 0; tempnumb>0; i++)
        {
            tempnumb=tempnumb-5;
            count++;
        }
        int [] numbArr = new int[count];   //Просто циклом было бы проще
       for(int i=0; numb>0;i++) {
           for(int in = 0; in<numbArr.length;in++)

        {
            numbArr[i] = numb;

            System.out.println(numbArr[i]);
            numb = numb-5;
        } }
    }
}
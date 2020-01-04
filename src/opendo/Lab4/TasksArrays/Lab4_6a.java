public class Lab4_6a {
    /*Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.*/
    public static void main(String[] args) {
        for(int i=0, a=-166; a<100; a=2*a+200, i++){
            if (a>-100){
                System.out.print(a+" ");
            }
        }
    }
}

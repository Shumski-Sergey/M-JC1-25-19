public class Lab4_5a {
    /*Выведите на экран все члены последовательности 2(An-1)–1, где a1=2, которые меньше 10000.*/
    public static void main(String args []){
        for(int a = 2, i = 1; i < a; a = 2 * a - 1,i++){
            if(a <=10000){
                System.out.print(a + " "); }
        }
    }
}

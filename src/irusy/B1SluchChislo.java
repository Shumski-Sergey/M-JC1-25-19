package src.irusy;


public class B1SluchChislo {
    public static void main(String[] args){
        int sluch = (int)(Math.random()*150 + 1)+5;
        if((sluch>25)&&(sluch<100)){
            System.out.println("Число " + sluch + " содержится в интервале");
        } else{
            System.out.println("Число " + sluch + " не содержится в интервале");
        }
    }

}

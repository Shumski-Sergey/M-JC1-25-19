package src.irusy;

public class SimpleNumberCicly {
    public static void main(String[] args) {
        int n=17;
        boolean f = true;
        int i;
        for(i=2; i<n ;i++)
        {
            if (n%i==0) {
                f = false;
                break;
            }
        }
        if (f) {System.out.println("число " + n + " простое");}
        else System.out.println("число " + n + " составное");
    }

}

package a.mitsura;

public class graduality {
    static public void main (String[] args){
        int a=15;
        int b=2;
        int c=1;
        int min=Math.min(a, Math.min(b, c));
        int max=Math.max(a, Math.max(b, c));
        int mid=Math.min(max, Math.min(a, Math.max(b, c)));
        System.out.println(min+ " " +mid+ " " +max);
    }

}

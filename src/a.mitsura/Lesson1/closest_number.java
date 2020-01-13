package a.mitsura.Lesson1;

public class closest_number {
    public static void main(String[] args){
        double m=8.5;
        double n=11.45;
        if (Math.abs(m-10)>Math.abs(n-10)){
            System.out.println(n+" ближе к 10, чем "+m);
        }else{
            System.out.println(m+" ближе к 10, чем "+n);
        }
    }
}

package pvetashkov;

public class Sravn {
    public static void main(String [] args) {
        int a=10;
        int b=9;
        int c=11;
        if (a<b&&b<c){
            System.out.println("this way a-b-c");}
        else if (a<b&&b>c){
            System.out.println("this way a c b");}
        else if (a>b&&a<c){
            System.out.println("this way b a c");}
        else if (a<b&&a>c) {
            System.out.println("this way c b a");}
        else if (b<c&&c<a){
            System.out.println("this way b c a");}
        else {System.out.println("this way c b a"); }
        }
    }

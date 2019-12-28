package aantonovich.Lesson2;

public class Lesson2task1 {
    public static void main(String[] args) {
        double m = 12;
        double n = 152;
        double number1,number2;
if (m<= 10) {
    number1 = 10-m;}
else { number1 = m-10;}
if ( n <= 10){
    number2 = 10-n;}
else {number2 = n - 10;}
if (number1 > number2) {
    System.out.println("Ближайшее к 10" +" "+ n);}
else if (number1 < number2){
    System.out.println("Ближайшее к 10" +" "+ m);}
else {    System.out.println("Числа равноудалены от 10");}
    }
    }

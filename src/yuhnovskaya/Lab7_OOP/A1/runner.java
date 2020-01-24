package src.yuhnovskaya.Lab7_OOP.A1;

public class runner {
        public  static void main(String[] avgs){
            Interval i1=new Interval(1,3,25);
            Interval i2=new Interval(3,0, 45);
            IntSec i3=new IntSec(89);
            System.out.println(i1.numsec()+" sec");
            System.out.println(i1.compInt(i2));
            System.out.println(i2.getHour()+" hour "+i2.getMin()+" min "+i2.getSec()+" sec");
            System.out.println(i3.getNumsec()+" sec");
        }
}

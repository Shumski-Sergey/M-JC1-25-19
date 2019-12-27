package dSankovsky.Arrays;

public class А6 {
    public static void main(String[] args) {
        //вывести все двузначные члены последовательности 2А(n-1)+200, начиная с -166
        int second = -166;
        int first = second;
        while (true) {
            second = 2 * second + 200;
            if (second >= 100)   //поскольку идет увеличение переменной second, то в конце концов она дойдет до 100+, а нам это не надо
                break;
            if(second<-99)    //есть вероятность, что при первых проходах second не перевалит за -100, поэтому нам значение меньше -100 не нужно
                continue;   //ну и я проверял, там число -132))
            System.out.println(second);
        }
    }

}

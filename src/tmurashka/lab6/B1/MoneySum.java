package tmurashka.lab6.B1;

public class MoneySum {
    public static void main(String[] args) {
        Money a = new Money(10, (byte)23);
        Money b = new Money(10, (byte)12);
        float x = 0.3f;
        Operator operator = new Operator();

        System.out.println(operator.sum(a, b));
        System.out.println(operator.divide(a, b));
        System.out.println(operator.minus(a, b));
        System.out.println(operator.division(a, x));
        System.out.println(operator.equals(a, b));
        System.out.println(operator.multiply(a, x));

    }
}

package dSankovsky.Generics.A3;

public class Runner {
    public static void main(String[] args) {
        A3<String> stringA3 = new A3<>();
        String[] arr = {"it's", "not", "true"};
        stringA3.setArr(arr);
        stringA3.Convert(stringA3.getArr());
        stringA3.PrintList(stringA3.getList());

        A3<Integer> integerA3 = new A3<>();
        Integer[] notArr = {1,2,3,4656,654775687,8768};
        integerA3.setArr(notArr);
        integerA3.Convert(integerA3.getArr());
        integerA3.PrintList(integerA3.getList());
    }
}

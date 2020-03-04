//package aantonovich.SecondControl;
//
//import java.util.ArrayList;
//
//public class Task2 {
//    public static void main(String[] args) {
//  int COUNT =0;int MAX=0;
//
//        int ELEMENT = 10;
//        int RANGE = 100; // диапозон чисел (0-100)
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 0; i< ELEMENT; i++){
//            arr.add(i, (int) (Math.random()*RANGE +1));
//
//            for (int k = 0; i < arr.size(); i++) {
//                for (int j = k + 1; j < arr.size(); j++) {
//                    if (arr[k] == arr[j]) {
//                        COUNT++;
//                    }
//                }
//                if (COUNT > MAX) {
//                    MAX = COUNT;
//                    MAX = arr[i];
//                }
//                COUNT = 0;
//            }
//    }  }
//}

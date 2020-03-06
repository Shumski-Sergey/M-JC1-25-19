package dbesan.secondcontrol.maxCountNumber;


import java.util.HashMap;
import java.util.Map;

public class Logics {
    private static Map<Integer, Integer> map = new HashMap<>();


   public static void maxCountNumber(int arr[]){

       for (int x : arr) {
               if (map.containsKey(x)) {
                   map.put(x, map.get(x) + 1);
               } else {
                   map.put(x, 1);
               }
           }
       int maxCount = 0;
       int maxCountingNumber = 0;
       for (Map.Entry< Integer, Integer> entry : map.entrySet()) {
           if (entry.getValue() > maxCount){
              maxCount = entry.getValue();
               maxCountingNumber =  entry.getKey();
           }
                 }
       System.out.println("Чаще всего встречается: " + maxCountingNumber + " - " + maxCount + " раз.");
       }

   }




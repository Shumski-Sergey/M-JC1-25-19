package src.irusy.SecondControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindMostCommon extends ArrayList<Integer> {
    public  int[] findMostCommon(){     //Находит самое часто встречающееся
        HashMap<Integer, Integer> count = new HashMap<>();  //создаем Хэшмап вида <число, сколько раз встретили>
        for(Integer i : this){
            if (count.containsKey(i)) {
                count.replace(i, count.get(i) + 1);
            }else{
                count.put(i, 1);
            }
        }

        int[] ans = {0, 0};  //Ответ возвращаем в виде массива из 2х элементов
        for (Map.Entry<Integer, Integer> pair : count.entrySet()) {  //итерируемся по мапе
            if (pair.getValue() > ans[1]) {
                ans[1] = pair.getValue();
                ans[0] = pair.getKey();
            }
        }
        return ans;
    }
}

package src.irusy.SecondControl;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MyList extends ArrayList<Integer>{
    public int findMax(){
        Integer ans = this.get(0);
        for(Integer i : this){
            ans = max(i,ans);
        }
        return ans;
    }

    public int findMin(){
        Integer ans = this.get(0);
        for(Integer i : this){
            ans = min(i,ans);
        }
        return ans;
    }

    public int findSumWithoutMaxMin(){
        Integer sum = 0;
        for(Integer i : this){
            sum += i;
        }
        sum -= this.findMax() + this.findMin();
        return sum;
    }
}

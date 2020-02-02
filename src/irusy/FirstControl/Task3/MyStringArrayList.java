package src.irusy.FirstControl.Task3;

import java.util.ArrayList;

public class MyStringArrayList extends ArrayList<String> {
    public ArrayList<String> findMax(){
        int maxLen = 0;
        ArrayList<String> result = new ArrayList<>();
        for(String s : this){
            if (s.length() > maxLen){
                result.clear();
                maxLen = s.length();
            }
            if (s.length() == maxLen){
                result.add(s);
            }
        }
        return result;
    }
}

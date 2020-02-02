package src.aProtasenia.FirstControl.Task_3;

import java.util.List;

public class stringsLength {
    public static int strLength(List<String> stringsList) {
        int maxLength = 0;
        for (int i = maxLength + 1; i < stringsList.size(); i++) {
            if ((stringsList.get(i)).length() > stringsList.get(maxLength).length()) {
                maxLength = i;
            }
        } return (stringsList.get(maxLength).length());
    }
}
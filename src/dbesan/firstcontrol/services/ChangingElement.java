package dbesan.firstcontrol.services;

import dbesan.firstcontrol.services.impl.UniqueService;

import java.util.ArrayList;

import static dbesan.firstcontrol.util.Constants.CHETNOST;
import static dbesan.firstcontrol.util.InputText.Text;
import static dbesan.firstcontrol.util.InputText.getText;

public class ChangingElement implements UniqueService {
    private static String text;
    private static ArrayList<Character> controlsecond = new ArrayList();

    public static void toLeft() {
        Text();
        System.out.println("Введенный текст будет преобразован в список.");
        text = getText();
        char[] texting = text.toCharArray();
        char[] temp = new char[texting.length];
        for (int i = 0; i < texting.length; i++) {
            if (i != 0 && i % CHETNOST == 0) {
                texting[i] = texting[i - 1];
            }
        }
        for (int i = 0; i < texting.length; i++) {
            controlsecond.add(texting[i]);
        }
    }

    @Override
    public String toString() {
        System.out.println("Результат:");
        String result = "";
        for (int i = 0; i < controlsecond.size(); i++) {
            System.out.print(controlsecond.get(i) + " ");
        }
        System.out.println();
        return result;
    }
}

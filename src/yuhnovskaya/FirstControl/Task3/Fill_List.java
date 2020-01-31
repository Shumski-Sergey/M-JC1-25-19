package src.yuhnovskaya.FirstControl.Task3;

import java.util.List;
import java.util.Scanner;

public class Fill_List {
    List<String> list;
    int list_size;

    public Fill_List(List<String> list, int list_size) {
        this.list = list;
        this.list_size=list_size;
    }
/*The method FillList(List<Sting>list, int list_size) calls the Scanner, that reads 'list_size' strings from the console.
 Then it adds the entered strings to the list.
*/
    public void FillList(List<String> list, int list_size){
        System.out.println("Enter strings:");
        Scanner scanner=new Scanner(System.in);

        for (int i=0; i<list_size; i++){
            String str=scanner.nextLine();
            list.add(str);
        }
    }
}

package KKropa.Lab_8_Collections_List;
//1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.
import java.util.ArrayList;

public class A1 {
    public static void main (String[] args){

        int elements = 10;
        int negativeMark = 3;

        ArrayList <Integer> mark = new ArrayList<>();


        for (int i=0; i<elements; i++ ){
            int a = (int) (Math.random()*10+1);
            mark.add(i, a);

        }
        System.out.println("Marks of students: " + mark);

        for (int i = 0; i<mark.size();i++){
            int a = mark.get(i);
            if (a<=negativeMark){
                mark.remove(i);
            }
        }
        System.out.println("Marks of students without negative marks: "+ mark);




    }
}

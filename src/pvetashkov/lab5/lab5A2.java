package pvetashkov.lab5;
import java.util.Scanner;
public class lab5A2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        String tmp, sort;
        System.out.println("How many strings will you type?");
        n=sc.nextInt();
        String str[]=new String[n];
        System.out.print("Type them & press Enter after each");
        for (int i=0;i<n;i++){
            str[i]=sc.next();
            System.out.println("your str is: "+ str[i]);}
        System.out.println("sort up or sort down? ");
        sort=sc.next();
        if (sort.equals("up") ){
            for (int i=n-1;i>=0;i--) {
                for (int j = 0; j < n - 1; j++) {
                    if (str[j].length()<str[j+1].length()){
                    tmp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = tmp;}
                }
                System.out.print(str[i]+"+");
            }
        }
        else if (sort.equals("down")){
            for (int i=n-1; i>=0;i--){
                for(int j=0;j<n-1;j++){
                    if (str[j].length()<str[j].length()){
                        tmp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=tmp;
                    }
                }System.out.print(str[i]+"-");
            }
        }
        else System.out.print("W-w-w-w-what?");
        System.out.println("_be happy_");
    }
}
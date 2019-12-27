package pvetashkov;
import java.util.Scanner;
import java.util.Random;
public class Deal {
    public static void main(String[] args){
    int n;
    Random rand=new Random();
    System.out.println("How much people are playing");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int array[][]=new int[n][5];
for (int i=0;i<n;i++){
    for (int j=0;j<5;j++){
        array[i][j]=rand.nextInt(53);


switch(array[i][j]) {
    case (1):
        System.out.print("2 heart_");
        break;
    case(2):
        System.out.print("2 diamond_");
        break;
    case (3):
        System.out.print("2 club_");
        break;
    case (4):
        System.out.print("2 spade_");
        break;
    case (5):
        System.out.print("3 heart_");
        break;
    case (6):
        System.out.print("3 club_");
        break;
    case (7):
        System.out.print("3 diamond_");
        break;
    case (8):
        System.out.print("3 spade_");
        break;
    case (9):
        System.out.print("4 heart_");
        break;
    case (10):
        System.out.print("4 diamond_");
        break;
    case (11):
        System.out.print("4 club_");
        break;
    case (12):
        System.out.print ("4 spade_");
        break;
    case (13):
        System.out.print ("5 heart_");
        break;
    case (14):
        System.out.print("5 diamond_");
        break;
    case (15):
        System.out.print("5 club_");
        break;
    case (16):
        System.out.print("5 spade_");
        break;
    case (17):
        System.out.print ("6 heart_");
        break;
    case (18):
        System.out.print("6 diamond_");
        break;
    case (19):
        System.out.print("6 club_");
        break;
    case (20):
        System.out.print("6 spade_");
        break;
    case (21):
        System.out.print ("7 heart_");
        break;
    case (22):
        System.out.print("7 diamond_");
        break;
    case (23):
        System.out.print("7 club_");
        break;
    case (24):
        System.out.print("7 spade_");
        break;
    case (25):
        System.out.print ("8 heart_");
        break;
    case (26):
        System.out.print("8 diamond_");
        break;
    case (27):
        System.out.print("8 club_");
        break;
    case (28):
        System.out.print("8 spade_");
        break;
    case (29):
        System.out.print ("9 heart_");
        break;
    case (30):
        System.out.print("9 diamond_");
        break;
    case (31):
        System.out.print("9 club_");
        break;
    case (32):
        System.out.print("9 spade_");
        break;
    case (33):
        System.out.print ("10 heart_");
        break;
    case (34):
        System.out.print("10 diamond_");
        break;
    case (35):
        System.out.print("10 club_");
        break;
    case (36):
        System.out.print("10 spade_");
        break;
    case (37):
        System.out.print ("valet heart_");
        break;
    case (38):
        System.out.print("val diamond_");
        break;
    case (39):
        System.out.print("val club_");
        break;
    case (40):
        System.out.print("val spade_");
        break;
    case (41):
        System.out.print ("Q heart_");
        break;
    case (42):
        System.out.print("Q diamond_");
        break;
    case (43):
        System.out.print("Q club_");
        break;
    case (44):
        System.out.print("Q spade_");
        break;
    case (45):
        System.out.print ("K heart_");
        break;
    case (46):
        System.out.print("K diamond_");
        break;
    case (47):
        System.out.print("K club_");
        break;
    case (48):
        System.out.print("K spade_");
        break;
    case (49):
        System.out.print ("A heart_");
        break;
    case (50):
        System.out.print("A diamond_");
        break;
    case (51):
        System.out.print("A club_");
        break;
    case (52):
        System.out.print("A spade_");
        break;
}
}
}
    }
}

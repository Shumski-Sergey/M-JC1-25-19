package pvetashkov;
import java.util.Scanner;
import java.util.Random;
public class Deal {
    public static void main(String[] args) {
        int n;
        Random rand = new Random();
        System.out.println("How much people are playing");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int array[][] = new int[n][5];
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < 4 ; j++) {
                array[i][j] = rand.nextInt(53);
                System.out.print(array[i][j]);
            }
        }
        String arr[][] = new String[n][5];//здесь уже чушь пошла
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < 5; l++) {
                for ( int i = 0; i < n; i++) {
                    for ( int j = 0; j < 5; j++) {
                        switch (array[i][j]){
                            case (1):
                                arr[k][l] = ("2 heart_");
                                break;
                            case (2):
                                arr[k][l] = ("2 diamond_");
                                break;
                            case (3):
                                arr[k][l] = ("2 club_");
                                break;
                            case (4):
                                arr[k][l] = ("2 spade_");
                                break;
                            case (5):
                                arr[k][l] = ("3 heart_");
                                break;
                            case (6):
                                arr[k][l] = ("3 club_");
                                break;
                            case (7):
                                arr[k][l] = ("3 diamond_");
                                break;
                            case (8):
                                arr[k][l] = ("3 spade_");
                                break;
                            case (9):
                                arr[k][l] = ("4 heart_");
                                break;
                            case (10):
                                arr[k][l] = ("4 diamond_");
                                break;
                            case (11):
                                arr[k][l] = ("4 club_");
                                break;
                            case (12):
                                arr[k][l] = ("4 spade_");
                                break;
                            case (13):
                                arr[k][l] = ("5 heart_");
                                break;
                            case (14):
                                arr[k][l] = ("5 diamond_");
                                break;
                            case (15):
                                arr[k][l] = ("5 club_");
                                break;
                            case (16):
                                arr[k][l] = ("5 spade_");
                                break;
                            case (17):
                                arr[k][l] = ("6 heart_");
                                break;
                            case (18):
                                arr[k][l] = ("6 diamond_");
                                break;
                            case (19):
                                arr[k][l] = ("6 club_");
                                break;
                            case (20):
                                arr[k][l] = ("6 spade_");
                                break;
                            case (21):
                                arr[k][l] = ("7 heart_");
                                break;
                            case (22):
                                arr[k][l] = ("7 diamond_");
                                break;
                            case (23):
                                arr[k][l] = ("7 club_");
                                break;
                            case (24):
                                arr[k][l] = ("7 spade_");
                                break;
                            case (25):
                                arr[k][l] = ("8 heart_");
                                break;
                            case (26):
                                arr[k][l] = ("8 diamond_");
                                break;
                            case (27):
                                arr[k][l] = ("8 club_");
                                break;
                            case (28):
                                arr[k][l] = ("8 spade_");
                                break;
                            case (29):
                                arr[k][l] = ("9 heart_");
                                break;
                            case (30):
                                arr[k][l] = ("9 diamond_");
                                break;
                            case (31):
                                arr[k][l] = ("9 club_");
                                break;
                            case (32):
                                arr[k][l] = ("9 spade_");
                                break;
                            case (33):
                                arr[k][l] = ("10 heart_");
                                break;
                            case (34):
                                arr[k][l] = ("10 diamond_");
                                break;
                            case (35):
                                arr[k][l] = ("10 club_");
                                break;
                            case (36):
                                arr[k][l] = ("10 spade_");
                                break;
                            case (37):
                                arr[k][l] = ("valet heart_");
                                break;
                            case (38):
                                arr[k][l] = ("val diamond_");
                                break;
                            case (39):
                                arr[k][l] = ("val club_");
                                break;
                            case (40):
                                arr[k][l] = ("val spade_");
                                break;
                            case (41):
                                arr[k][l] = ("Q heart_");
                                break;
                            case (42):
                                arr[k][l] = ("Q diamond_");
                                break;
                            case (43):
                                arr[k][l] = ("Q club_");
                                break;
                            case (44):
                                arr[k][l] = ("Q spade_");
                                break;
                            case (45):
                                arr[k][l] = ("K heart_");
                                break;
                            case (46):
                                arr[k][l] = ("K diamond_");
                                break;
                            case (47):
                                arr[k][l] = ("K club_");
                                break;
                            case (48):
                                arr[k][l] = ("K spade_");
                                break;
                            case (49):
                                arr[k][l] = ("A heart_");
                                break;
                            case (50):
                                arr[k][l] = ("A diamond_");
                                break;
                            case (51):
                                arr[k][l] = ("A club_");
                                break;
                            case (52):
                                arr[k][l] = ("A spade_");
                                break;}
                                for (k=0;k<n-1;k++); {
                                    for (l = 0; l < 4; l++) ;

                                    {
                                        System.out.println(arr[k][l]);
                                    }
                                }
                      }
                    }

                    }
                }
            }
        }
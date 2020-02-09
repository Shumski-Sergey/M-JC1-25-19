package aantonovich.RegEx;
// Составить регулярное выражение, определяющее является ли заданная строка IP адресом,
// записанным в десятичном виде.
//– пример правильных выражений: 127.0.0.1, 255.255.255.0.
//– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.
import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Enter IP address:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if( s.matches("\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b")){
            System.out.println("OK");
        }
        else {
            System.out.println("Your IP address isn't correctly");
        }
    }
}
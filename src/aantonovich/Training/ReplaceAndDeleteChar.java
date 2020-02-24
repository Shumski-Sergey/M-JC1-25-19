package aantonovich.Training;

public class ReplaceAndDeleteChar {
    public static void main(String[] args) {
        String string = "####??????###?#?#?#?#?#?#?";
        String newString = string.replace("?", "HELLO ").replace("#", "");
        System.out.println(newString);
    }
}

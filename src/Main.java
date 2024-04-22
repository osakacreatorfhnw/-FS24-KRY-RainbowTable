import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> passwds = Passwords.getFirst2000Passwd();

        for (String s : passwds){
            System.out.println(s);
        }
        System.out.println(passwds.size());
    }
}

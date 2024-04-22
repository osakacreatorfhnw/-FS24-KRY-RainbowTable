import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> passwds = Passwords.getFirst2000Passwd();

        for (String s : passwds){
            System.out.println(s);
        }
        System.out.println(passwds.size());

        String password = "HelloWorld";
        System.out.println("68e109f0f40ca72a15e05cc22786f8e6".equals(MD5Util.hashFunc(password)));

    }
}

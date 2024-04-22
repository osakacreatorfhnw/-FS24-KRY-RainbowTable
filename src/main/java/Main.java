import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> passwds = Passwords.getFirst2000Passwd();

        for (String s : passwds){
            System.out.println(s);
        }
        System.out.println(passwds.size());

        String password = "HelloWorld";
        System.out.println("68e109f0f40ca72a15e05cc22786f8e6".equals(MD5Util.hashFunc(password)));

        BigInteger v = new BigInteger("29c3eea3f305d6b823f562ac4be35217",16);
        System.out.println(Reduction.reduction(v,BigInteger.valueOf(0)));
        // RainbowTable table = new RainbowTable(passwds);
    }
}

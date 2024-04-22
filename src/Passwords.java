import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Passwords {

    private static String[] digit = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};

    public static List<String> getFirst2000Passwd() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            String[] passwd = new String[7];
            Arrays.fill(passwd, "0");
            passwd[6] = digit[i % 36];
            passwd[5] = digit[(i / 36) % 36];
            passwd[4] = digit[((i / 36) / 36) % 36];

            String tmp = String.join("", passwd);
            list.add(tmp);
        }

        return list;
    }
}

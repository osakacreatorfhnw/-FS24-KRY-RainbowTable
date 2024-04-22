import java.math.BigInteger;

public class Reduction {

    private static String[] z = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z"};

    public static String reduction(BigInteger h, BigInteger level){
        BigInteger hash = h.add(level);
        String s = "";

        for(int i = 0; i < 7; i++){
            BigInteger len = BigInteger.valueOf(z.length);
            BigInteger index = hash.mod(len);
            s = z[index.intValue()] + s;
            hash = hash.divide(len);
        }

        return s;
    }
}

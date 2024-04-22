import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RainbowTable {
    private Map<String,String> rainbowTable = new HashMap<>();

    public RainbowTable(List<String> passwords) throws InterruptedException {
        for (String password : passwords) {
            String hash = MD5Util.hashFunc(password);

            for (int i = 0; i <= 2000; i++){
                hash = Reduction.reduction(new BigInteger(hash,16), BigInteger.valueOf(i));
                hash = MD5Util.hashFunc(hash);
            }
            rainbowTable.put(hash, password);
        }
    }


}

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RainbowTable {
    private Map<String,String> rainbowTable = new HashMap<>();

    public RainbowTable(List<String> passwords) {
        for (String password : passwords) {
            String hash = password;
            for (int i = 0; i < 2000; i++){
                hash = MD5Util.hashFunc(hash);
                hash = Reduction.reduction(new BigInteger(hash,16), BigInteger.valueOf(i));
            }
            rainbowTable.put(password, hash);
        }
    }

    public String getEndValue(String startValue){
        return rainbowTable.getOrDefault(startValue, "");
    }


}

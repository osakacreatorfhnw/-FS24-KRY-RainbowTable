import java.math.BigInteger;

public class CrackHash {
    private RainbowTable table;

    public CrackHash(RainbowTable t) {
        this.table = t;
    }

    /*
    * Ab dem Startwert wird die Kette berechnet.
    * Ziel dabei ist x von h(x) herauszufinden.
    * */
    public String crackHash(String h) {
        String startV = searchStart(new String(h));

        if(!startV.equals("")){
            String hash = startV;
            for (int i = 0; i < 2000; i++){
                String sol = hash;
                hash = MD5Util.hashFunc(sol);

                if(hash.equals(h)){
                    return sol;
                }

                hash = Reduction.reduction(new BigInteger(hash,16), BigInteger.valueOf(i));
            }
        }
        return "";
    }

    /*
    * Berechnet rückwärts basierend auf den Runden.
    * Wenn in Runde i ein Startwert eines Endwerts in der
    * Rainbow Table gefunden wurde, wird der Startwert zurückgegeben.
    * */
    private String searchStart(String hash) {
        for(int i = 1999; i >= 0; i--){
            String endV = calcChain(new String(hash),i);
            String startV = table.getStartValue(endV);

            if(!startV.equals("")){
                return startV;
            }
        }
        return "";
    }

    /*
    * Berechnet die Rainbow Table Kette ab Runde round
    * und gibt den Endwert zurück
    * */
    private String calcChain(String s, int round) {
        String hash = Reduction.reduction(new BigInteger(s,16), BigInteger.valueOf(round));

        for(int i = round + 1; i <= 1999; i++) {
            hash = MD5Util.hashFunc(hash);
            hash = Reduction.reduction(new BigInteger(hash,16), BigInteger.valueOf(i));
        }

        return hash;
    }
}

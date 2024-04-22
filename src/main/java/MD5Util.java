import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {

    public static String hashFunc (String input){

        return DigestUtils.md5Hex(input);
    }
}

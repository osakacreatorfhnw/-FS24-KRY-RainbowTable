import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> passwds = Passwords.getFirst2000Passwd();
        RainbowTable table = new RainbowTable(passwds);
        CrackHash crack = new CrackHash(table);

        System.out.println(crack.crackHash("1d56a37fb6b08aa709fe90e12ca59e12"));
    }
}

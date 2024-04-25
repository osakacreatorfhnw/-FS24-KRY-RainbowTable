import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> passwds = Passwords.getFirst2000Passwd();
        RainbowTable table = new RainbowTable(passwds);
        System.out.println("FINAL: " + table.getEndValue("0000000"));

    }
}

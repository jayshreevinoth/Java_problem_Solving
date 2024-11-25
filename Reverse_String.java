import javax.swing.plaf.synth.SynthTextAreaUI;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "abcdefg";
        String newStr = "";
        for (int i = str.length(); i > 0; i--) {
            newStr = newStr + str.charAt(i - 1);
        }
        System.out.println(newStr);
    }
}

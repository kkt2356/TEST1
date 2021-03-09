import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample1 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));

    }

    static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n - 1);  // 2
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int k = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                k++;
            }
            sb.append(String.format("%d%c", k, s.charAt(i)));
            i++;
        }
        return sb.toString();
    }
}

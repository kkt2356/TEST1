public class Leet37 {
    // n = 1  => 1
    // n = 4  => 1 => 11 => 21 => 1211
    public static void main(String[] args) {

    }

    static String countAndSay(int n) {
        if(n == 1) return "1";

        String val = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        // val[0] = 1  , val[1] = 2
        while( i < val.length()) {
            int j = 1;
            while (i + 1 < val.length() && val.charAt(i) == val.charAt(i+1) ) {
                j++;
                i++;
            }

            sb.append(String.format("%d%c",j,val.charAt(i)));
            i++;
        }
        return sb.toString();
    }
}

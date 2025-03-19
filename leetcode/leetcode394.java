package leetcode;

public class leetcode394 {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        return strings("", s);
    }

    public static String strings(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        int num = ch - '0';

        if (ch >= '0' && ch <= '9') {
            int start = up.indexOf('[');
            int end = up.indexOf(']');

            if (start != -1 && end != -1) {
                String extracted = up.substring(start + 1, end);
                String str = "";

                for (int i = 0; i < num; i++) {
                    str += extracted;
                }
                return strings(p+str, up.substring(end+1));
            }
        }
        return p;
    }
}
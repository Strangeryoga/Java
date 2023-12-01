

public class StreamString {
    public static void main(String[] args) {
        String a = "abcdeyoufghijyou";
//        skip("", a);
//        System.out.println(skipYou(a));
        System.out.println(skipAppNotApple("bacapplecdah"));
    }

    // Skip 'a' from the String
    static void skip(String e, String up) {
        if (up.isEmpty()) {
            System.out.println(e);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(e, up.substring(1));
        } else {
            skip(e + ch, up.substring(1));
        }
    }

    // Skip the whole string from the String
    static String skipYou(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("you")) {
            return skipYou(up.substring(3));
        } else {
            return up.charAt(0) + skipYou(up.substring(1));
        }
    }

    // Skip a string if it's not the required string
    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }


}

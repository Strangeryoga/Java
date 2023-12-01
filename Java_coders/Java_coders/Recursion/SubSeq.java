import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");
//        System.out.println(subseqAL("", "abc"));
//        System.out.println(subseqAL2("", "abc"));
//        subseqAscii("", "abc");
        System.out.println(subseqAsciiRet("", "abc"));
    }


    // Print the String in subsequence like a b c ab bc abc
    static void subseq(String s, String helloWorld) {
        // Base case: if the second string is empty, print the current subsequence and return
        if (helloWorld.isEmpty()) {
            System.out.println(s);
            return;
        }
        // Include the first character of the second string in the current subsequence
        char ch = helloWorld.charAt(0);
        subseq(s + ch, helloWorld.substring(1));  // Recursively generate subsequences including the current character
        // Exclude the first character of the second string in the current subsequence
        subseq(s, helloWorld.substring(1));  // Recursively generate subsequences excluding the current character
    }


    // Print the String in subsequence but in the form of ArrayList
    static ArrayList<String> subseqAL(String s, String abc) {
        if (abc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        char ch = abc.charAt(0);
        ArrayList<String> left = subseqAL(s + ch, abc.substring(1));
        ArrayList<String> right = subseqAL(s , abc.substring(1));

        left.addAll(right);
        return left;

    }


    // Print the String in subsequence in the form of ArrayList and also pass the parameters as ArrayList
    static ArrayList<String> subseqAL2(String s, String abc) {
       ArrayList<String> retList = new ArrayList<>();
       subseqALHelp(s, abc, retList);
        return retList;
    }
    static void subseqALHelp(String s, String abc, ArrayList<String> retList) {
        if(abc.isEmpty()) {
            retList.add(s);
            return;
        }
        char ch = abc.charAt(0);
        subseqALHelp(s + ch, abc.substring(1), retList);
        subseqALHelp(s, abc.substring(1), retList);
    }

    // Gives the Ascii values of the subsequence
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    // Gives the Ascii values of the subsequence in ArrayList
    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> f = subseqAsciiRet(p + ch, up.substring(1));  // including the current character
        ArrayList<String> s = subseqAsciiRet(p, up.substring(1));  // excluding the current character
        // Recursively generate subsequences including the ASCII value of the current character
        ArrayList<String> t = subseqAsciiRet(p + (ch+0), up.substring(1));

        f.addAll(s);
        f.addAll(t);
        return f;
    }
}

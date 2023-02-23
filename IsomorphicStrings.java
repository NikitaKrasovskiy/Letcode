import java.util.Arrays;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] sChar = new int[256];
        int[] stChar = new int[256];
        Arrays.fill(sChar, 0);
        Arrays.fill(stChar, 0);

        for (int i = 0; i < s.length(); i++) {
            int sCharIndex = s.charAt(i);
            int stCharIndex = t.charAt(i);

            if (sChar[sCharIndex] == 0 && stChar[stCharIndex] == 0) {
                sChar[sCharIndex] = stCharIndex;
                stChar[stCharIndex] = sCharIndex;
            } else if (sChar[sCharIndex] != stCharIndex || stChar[stCharIndex] != sCharIndex) {
                return false;
            }
        }
        return true;
    }
}

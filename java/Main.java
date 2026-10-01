import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            while (set.contains(ch)) {

                set.remove(str.charAt(left));

                left++;
            }

            set.add(ch);

            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
        }

        System.out.println("Longest length = " + maxLength);
    }
}

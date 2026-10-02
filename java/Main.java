import java.util.*; 
 
public class Main { 
 
    public static void main(String[] args) { 
 
        String str = "eceba"; 
        int k = 2; 
 
        HashMap<Character, Integer> map = new HashMap<>(); 
 
        int left = 0; 
        int maxLength = 0; 
 
        for (int right = 0; right < str.length(); right++) { 
 
            char ch = str.charAt(right); 
 
            // Add character to HashMap 
            map.put(ch, map.getOrDefault(ch, 0) + 1); 
 
            // If more than K distinct characters 
            while (map.size() > k) { 
 
                char leftChar = str.charAt(left); 
 
                map.put(leftChar, map.get(leftChar) - 1); 
 
                if (map.get(leftChar) == 0) { 
                    map.remove(leftChar); 
                } 
 
                left++; 
            } 
 
            // Calculate window length 
            int length = right - left + 1; 
 
            maxLength = Math.max(maxLength, length); 
        } 
 
        System.out.println("Longest length = " + maxLength); 
    } 
}

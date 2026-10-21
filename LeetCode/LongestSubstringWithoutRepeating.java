class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            String temp = "";
            
            for (int j = i; j < s.length(); j++) {
                
                char ch = s.charAt(j);
                
                if (temp.indexOf(ch) != -1) {
                    break;
                }
                
                temp += ch;
                
                maxLength = Math.max(maxLength, temp.length());
            }
        }
        
        return maxLength;
    }

    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                String rev = new StringBuilder(sub).reverse().toString();

                if (sub.equals(rev) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }
}

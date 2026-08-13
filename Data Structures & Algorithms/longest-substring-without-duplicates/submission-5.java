class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        int length = 0, maxLength = 0;

        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length = right - left + 1;
            maxLength = Math.max(length, maxLength);
            right++;
        }
        return maxLength;
    }
}

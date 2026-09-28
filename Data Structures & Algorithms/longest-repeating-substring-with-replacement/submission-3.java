class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLen = 0, maxFreq = 0;
        int[] count = new int[26];

        for(int r = 0; r < s.length(); r++){
            int charIdx = s.charAt(r) - 'A';
            count[charIdx]++;

            maxFreq = Math.max(maxFreq, count[charIdx]);

            while((r-l+1) - maxFreq > k){
                count[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        
        //dont use the sorting of each string here as keys
        //instead we can use the same count array to generate keys
        for(String str : strs){
            int[] count = new int[26];

            for(char c : str.toCharArray())
                count[c - 'a']++;

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

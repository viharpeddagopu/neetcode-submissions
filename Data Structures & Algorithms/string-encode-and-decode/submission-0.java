
public class Solution {
    //use length too in the string instead of only a delimeter.
    //say "hello","world" = 5#hello5#world

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : strs) {
            // Append the length of the string, a delimiter, and the string itself
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the next delimiter '#' starting from index i
            int delimiterIndex = str.indexOf('#', i);
            
            // The number before the delimiter is the length of the string
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            
            // Extract the string based on the parsed length
            int stringStartIndex = delimiterIndex + 1;
            String originalString = str.substring(stringStartIndex, stringStartIndex + length);
            
            decoded_strs.add(originalString);
            
            // Move the pointer i to the start of the next encoded string
            i = stringStartIndex + length;
        }
        
        return decoded_strs;
    }
}
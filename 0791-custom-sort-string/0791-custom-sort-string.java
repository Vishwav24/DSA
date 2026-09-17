class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i < order.length(); i++)
            freq1[order.charAt(i) - 'a']++;

        for(int i = 0; i < s.length(); i++)
            freq2[s.charAt(i) - 'a']++;
    
        for(int i = 0; i < order.length(); i++){
            char ch = order.charAt(i);
            if(freq1[ch - 'a'] == 0 && freq2[ch - 'a'] == 0)      
                sb.append(ch);
            else if(freq2[ch - 'a'] > 0)
                while(freq2[ch - 'a']-- > 0) 
                    sb.append(ch);
        }

        for(int i = 0; i < 26; i++){
            char ch = 'a';
                while(freq2[i]-- > 0)
                    sb.append((char)('a' + i));
        }

        return sb.toString();
    }
}
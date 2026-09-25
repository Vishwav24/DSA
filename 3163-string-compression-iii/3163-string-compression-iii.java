class Solution {
    public String compressedString(String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length();){
            count = 0;
            char ch = word.charAt(i);
            while(i < word.length() && ch == word.charAt(i) && count < 9){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}
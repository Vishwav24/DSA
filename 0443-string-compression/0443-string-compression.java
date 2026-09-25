class Solution {
    public int compress(char[] chars) {
        int left = 0, count = 0;

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }

            if(count == 1) {
            i--;
            chars[left] = ch;
            left++;
            count = 0;
            }
            
            else if(count > 1){
                chars[left] = ch;
                left++;
                String s = String.valueOf(count);
                for(int j = 0; j < s.length(); j++){
                    chars[left] = s.charAt(j);
                    left++;
                }
                count = 0;
                i--;
            }
        }
        return left;
    }
}
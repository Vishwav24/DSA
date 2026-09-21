class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                while(s.charAt(left) != ch){
                    map.remove(s.charAt(left));
                    left++;
                }
                map.remove(s.charAt(left));
                left++;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
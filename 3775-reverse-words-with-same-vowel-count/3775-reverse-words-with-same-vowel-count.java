class Solution {
    public int strcnt (String s){
        ArrayList <Character> arr  =
        new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int cnt = 0;
        for(int i = 0; i < s.length(); i++)
            if(arr.contains(s.charAt(i))) cnt++;
        return cnt;
    }

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i = 0; i < split[0].length(); i++){
            char ch = split[0].charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }       
        ans.append(split[0] + " ");
        for(int i = 1; i < split.length; i++){
            StringBuilder sb = new StringBuilder(split[i]);
            int cnt = strcnt(sb.reverse().toString());
            if(cnt == count) ans.append(sb);
            else ans.append(sb.reverse());
            ans.append(" ");
        }

        return ans.toString().trim();
    }
}
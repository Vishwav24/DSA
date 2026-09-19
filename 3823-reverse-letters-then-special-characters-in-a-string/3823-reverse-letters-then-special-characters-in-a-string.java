class Solution {
    public String reverseByType(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) sb1.append(ch);
            else sb2.append(ch);
        }

        String s1 = sb1.reverse().toString();
        String s2 = sb2.reverse().toString();

        int k = 0, l = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isLetter(arr[i])) arr[i] = s1.charAt(k++);
            else arr[i] = s2.charAt(l++);
        }
        return new String(arr);
    }
}
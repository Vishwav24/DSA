class Solution {
    public int helper(String s, int i, long num, int sign){
        if(i >= s.length() || !Character.isDigit(s.charAt(i)))
            return (int)(sign * num);

        num = num * 10 + (s.charAt(i) -'0');

        if(num * sign <=  Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(num * sign  >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return helper(s, i + 1, num, sign);
    }

    public int myatoi(String s){
        int num = 0, i = 0, sign = 1;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
           sign = (s.charAt(i) == '-') ? -1 : 1;
           i++;
        }
        return helper(s, i, num, sign);
    }

    public int myAtoi(String s) {
        if(s.length() == 0) return 0; 
        return myatoi(s);
    }
}
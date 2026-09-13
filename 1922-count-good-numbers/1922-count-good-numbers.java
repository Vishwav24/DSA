class Solution {

    static long MOD = 1000000007;

    public long myPow(long n, long num){
        if(num == 0) return 1;
        if(n == 0) return 0;

        long ans = 0;
        if(num % 2 == 0) 
        {
            ans = myPow(n, num / 2);
            ans = (ans * ans) % MOD;
        }
        else ans = n * myPow(n, num - 1) % MOD;
        
        return ans;
    }
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int) ((myPow(5, even) * myPow(4, odd)) % MOD);
    }
}
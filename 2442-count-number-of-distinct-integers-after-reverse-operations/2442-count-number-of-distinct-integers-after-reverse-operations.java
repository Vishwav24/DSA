class Solution {
    public int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
            set.add(reverse(a));
        }
        return set.size();
    }
}
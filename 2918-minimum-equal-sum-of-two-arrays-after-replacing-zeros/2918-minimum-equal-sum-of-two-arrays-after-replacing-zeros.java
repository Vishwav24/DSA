class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long cnt1 = 0, cnt2 = 0, sum1 = 0, sum2 = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] == 0) {
                cnt1++;
                nums1[i] = 1;
            }
            sum1 += nums1[i];
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == 0) {
                cnt2++;
                nums2[i] = 1;
            }
            sum2 += nums2[i];
        }

        if(sum1 > sum2 && cnt2 == 0 || sum2 > sum1 && cnt1 == 0) return -1;
        return Math.max(sum1, sum2);
    }
}
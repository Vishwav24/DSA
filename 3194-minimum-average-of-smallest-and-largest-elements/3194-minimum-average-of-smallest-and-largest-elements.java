class Solution {
    public double minimumAverage(int[] nums) {
    int n = nums.length;
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
    double min = 51.0;
    int left = 0, right = n - 1, k = 0;
    while(left < right){
        min = Math.min((double)((nums[left] + nums[right]) / 2.0), min) ;
        left++;
        right--;
    }
    
    return min;
    }
}
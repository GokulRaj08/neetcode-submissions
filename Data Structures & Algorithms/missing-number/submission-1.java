class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int exp=n*(n+1)/2;
        // int a=0;
        // for(int i=0;i<n;i++){
        //     a=a+nums[i];
        // }
        // return exp-a;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^i^nums[i];
        }
        return xor^nums.length;
           }
}

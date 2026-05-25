class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int store=0;
        for(int num:nums){
            if(count==0){
                store=num;
            }
            if(num==store){
                count++;
            
            }
            else{
                count--;
            }
        }
        return store;
    }
}
class Solution {
    public int maxDifference(String s) {
        int []freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;

        }
        int maxValue=0;
        int minValue=Integer.MAX_VALUE;
        for(int f:freq){
            if(f%2==1){
                maxValue=Math.max(maxValue,f);
            }
            if(f>0 && f%2==0){
                minValue=Math.min(minValue,f);
            }
        }
        return maxValue-minValue;
        
    }
}
class Solution {
    public int maxScore(String s) {
        int one=0;
        int zero=0;
        int maxValue=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                one++;
            }
           
        }
         for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0'){
                    zero++;
                }else{
                    one--;
                    
                }
                maxValue=Math.max(maxValue,one+zero);
            }
        return maxValue;
        
    }
}
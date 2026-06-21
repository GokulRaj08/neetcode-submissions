class Solution {
    public String largestGoodInteger(String num) {
        String answer="";
        for(int i=0;i<num.length()-2;i++){
            char ch=num.charAt(i);
            if(ch==num.charAt(i+1) && ch==num.charAt(i+2)){
               String temp=num.substring(i,i+3);
            if(temp.compareTo(answer)>0){
                answer=temp;
            }
            }
            
        }
        return answer;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String cleared="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleared+=c;
            }
        }
        String reverse="";
        for(int i=cleared.length()-1;i>=0;i--){
           
            reverse+=cleared.charAt(i);
        }
        return cleared.equals(reverse);
       
    }
     
}

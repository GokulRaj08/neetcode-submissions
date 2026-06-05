class Solution {
    public int findLucky(int[] arr) {
        int[] feq=new int[501];
        for(int i=0;i<arr.length;i++){
            feq[arr[i]]++;
        }
        for(int i=500;i>=1;i--){
            if(feq[i]==i){
                return i;
            }
        }

        return -1;
    }
}
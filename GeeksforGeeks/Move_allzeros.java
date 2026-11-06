class Solution {
    void pushZerosToEnd(int[] arr) {
        int i = 0;
        for (int k=0; k<arr.length;k++) {
        if (arr[k]!=0){
        arr[i]=arr[k];
        i++;
        }}
        while(i<arr.length){
        arr[i]=0;
        i++;
        }}}
class Solution {
    public boolean isPalindrome(ListNode head) {
     int[] arr = new int[100000];
     int i = 0;
     while (head != null) {
    arr[i] = head.val;
     i++;
    head = head.next;  }
    int start = 0;
    int end = i - 1;
     while (start < end) {
   if (arr[start] != arr[end]) {
   return false;
     }
    start++;
    end--;
    }
    return true;
    }}
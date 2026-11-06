import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> printList(Node head) {
    ArrayList<Integer> arr = new ArrayList<>();
    Node temp = head;
    while (temp != null) {
    arr.add(temp.data);
    temp = temp.next;}
  return arr;
    }}
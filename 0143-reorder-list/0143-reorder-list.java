// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int size(ListNode head){
//         int count = 0;
//         ListNode temp = head;

//         while(temp != null){
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }
//     public void reorderList(ListNode head) {

//         int n = size(head);

//         int[] arr = new int[n];

//         ListNode temp = head;

//         int i = 0;

//         while(temp != null){
//             arr[i] = temp.val;
//             temp = temp.next; 
//             i++;
//         }

//         int low = 0; 
//         int high = n - 1;

//         temp = head;
//         int count = 0;
//         while(temp != null){
//             if(count % 2 == 0){
//                 temp.val = arr[low];
//                 low++;
//             }else{
//                 temp.val = arr[high];
//                 high--;
//             }
//             temp = temp.next;
//             count++;
//         }
//     }
// }



// // ArrayList


class Solution {
    
    public void reorderList(ListNode head) {
        if(head.next == null)return;
        
        ArrayList<ListNode> li = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            li.add(temp);
            temp = temp.next;
        }

        int low = 0;
        int high = li.size() - 1;

        while (low < high) {
            li.get(low).next = li.get(high);
            low++;

            if (low == high) {
                break;
            }

            li.get(high).next = li.get(low);
            high--;
        }

        li.get(low).next = null;
    }
}
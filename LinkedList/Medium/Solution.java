
   /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeA = 0;
        int sizeB =0;
        while(tempA!=null){
            sizeA++;
            tempA =tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB =tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(sizeA<sizeB){
            int steps = sizeB - sizeA;
            for(int i=1; i<= steps;i++){   // for(int i =1; i<steps - 1) give error || done dry run check the note
                tempB = tempB.next;
            }
        }else{
            int steps = sizeA - sizeB;
            for(int i=1; i<= steps;i++){
                tempA = tempA.next;
            } 
        }
        while(tempA!=tempB){
            tempA= tempA.next;
            tempB= tempB.next;
        }
    return tempA;
    }
} 


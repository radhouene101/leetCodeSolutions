public class MaximumTwinSumofaLinkedList {// difficulty Medium https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public int pairSum(ListNode head) {
            int max=0;
            if(head==null || head.next==null){
                return head.val;
            }
            ListNode lengthPointer=head;
            int length=0;
            while(lengthPointer.next!=null){

                lengthPointer=lengthPointer.next;
                length++;
            }
            ListNode current=head;
            int i=-1;
            int[] list= new int[length+1];

            while(current.next!=null){
                i++;
                list[i]=current.val;
                current=current.next;
            }
            i++;
            list[i]=current.val;

            for(int j=0;j<(list.length/2);j++){
                if(list[j]+list[i]>max){
                    max=list[j]+list[i];
                }
            /*System.out.println(" \nlist[i] = "+ list[i]+" list[j] "+ list[j]);
            System.out.println("\n      i  = " + i + "       j =" + j);
            System.out.println("\nlist[j]+list[i]  "+ (list[j]+list[i]));*/
                i--;
            }
            return max;

        }
    }

public class RemoveDuplicatesfromSortedList { //easy https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public ListNode deleteDuplicates(ListNode head) {
        if( head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        while(current.next!=null){
            if(current.val==current.next.val){// checking if the next and the next of next are equal
                current.next=current.next.next;
            }else{
                current=current.next;
            }

        }
        return head;
    }
}
 class ListNode{
    public ListNode next;
    int val;
    public ListNode(int val){
        this.val=val;
    }
}

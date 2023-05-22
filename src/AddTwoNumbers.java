public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l1.next==null){
            return l1;
        }
        int sumL1=0;
        int coef =1;
        int sumL2=0;
        ListNode result=new ListNode(0);
        while(l1.next!=null ){
            sumL1+= l1.val*coef;
            l1=l1.next;
            coef=coef*10;
        }
        sumL1+= l1.val*coef;
        coef=1;
        while(l2.next!=null){
            sumL2+= l2.val*coef;
            l2=l2.next;
            coef=coef*10;
        }
        sumL2+= l2.val*coef;
        int sum = sumL1+sumL2;
        System.out.println(sumL1+" " +sumL2 + " final sum is "+ sum);

        ListNode current = result;
        while(sum/10 != 0){
            System.out.print(" -> "+ sum%10);
            current.val=sum%10;
            current.next = new ListNode(0);
            current=current.next;
            sum=sum/10;
        }
        current.val=sum%10;
        return result;
    }
}

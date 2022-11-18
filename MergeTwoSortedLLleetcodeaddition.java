class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        ListNode head;
        ListNode temp;
        ListNode p1 = list1;
        ListNode p2 = list2;
        if(p1.val < p2.val){
            temp = head = p1;
            p1 = p1.next;
        }else{
            temp = head = p2;
            p2 = p2.next;
        }
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                temp.next = p1;
                p1 = p1.next;
            }else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        while(p1 != null){
            temp.next = p1;
            p1 = p1.next;
            temp = temp.next;
        }
        while(p2 != null){
            temp.next = p2;
            p2 = p2.next;
            temp = temp.next;
        }
        return head;
    }
    
}

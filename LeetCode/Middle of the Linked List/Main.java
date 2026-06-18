class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode temp =head;
       int c =0;
        int i=0;
        while(temp!=null){
            i++;
            temp = temp.next;
        }
        
        c = (i/2);

        temp = head;

    
    while(c>0){
        temp=temp.next;
        c--;}
        return temp;    }
}
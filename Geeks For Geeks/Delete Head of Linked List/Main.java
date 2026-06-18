/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node deleteHead(Node head) {
        Node temp = head;
        temp=temp.next;
        head=temp;
        return head;
        
    }
}
class Solution {

    // logic Time -> O(n) Space - O(1)
    public static Node reverse(Node node, int k) {
        // Your code here
        Node prev = null;
        Node next = null;
        Node curr = node;

        while (k != 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;

        }

        return prev;
    }
}


public Node reverse(Node head)
    {
        Node current=head,pre=null;
        while(current!=null)
        {
            Node r=current.next;
            current.next=pre;
            pre=current;
            current=r;
        }
        return pre;
    }
    public Node mid(Node head)
    {
        Node slow=head,fast=head;
        if(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
    if(head==null || head.next==null)
    {
        return true;
    }
    Node midone=mid(head);
    Node last=reverse(midone.next);
    Node first=head;
    while(last!=null && first!=null)
    {
        if(first.data!=last.data)
        {
            return false;
        }
        first=first.next;
        last=last.next;
    }
    return true;
        
    }
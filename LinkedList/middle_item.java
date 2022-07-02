// Singly Linked List

import java.util.*;



    







 creatio 

ata;next / ref

 

e

N

    }Node slow = head;Node at = head;while (fat!=    // fatpoint

   // sowpointr
slow = slow.next;
Sstemo





oid inet_end() {
             e();
S 

if (hed== null) {

   head= ode;se {// travelling to the end of the listNode  =hed; //te (n.next != null) {n=n.next; // pointing
                                                                                                                                                                             // to
                                                                                                                                                                             // the
                                                                                                                                                                             // next
                                                                                                                                                                             // node

}n.next = node; // now aft 

}

    public void display() {
        Node n = head; // temporary (Node) Object for travelling

        if (head == null) {
            System.out.println("Your Linked List is Empty");
        } else {
            System.out.println("\n\t Our Linked List is \t");
            while (n != null) {
                System.out.print(n.data + "\n");
                n = n.next; // pointing to the next node

            }
            System.out.print(n.data);
        }

    }


}

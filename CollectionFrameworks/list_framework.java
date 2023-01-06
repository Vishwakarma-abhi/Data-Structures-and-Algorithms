import java.util.*;

class list_framework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String visit;
        System.out.println("Welcome to Collection Frameworks");
        System.out.println("Enter \n 1 for Arraylist \n 2 for Linkedlist \n 3 for Stack \n 4 for Vector \n 5 for exit");

        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("ArrayList Implementation");
                // ArraylistayList
                ArrayList<Integer> arr = new ArrayList<>();
                learn_arraylist(arr);

                break;
            case 2:
                System.out.println("\nLinkedList Implementation");
                // LinkedList
                LinkedList<Integer> linkedlist = new LinkedList<>();
                learn_linkedlist(linkedlist);

                break;
            case 3:
                // Stack
                Stack<Integer> stk = new Stack<>();
                learn_stack(stk);
                break;
            case 4:
                // vector
                Vector<Integer> vector = new Vector<>();
                learn_vector(vector);
                break;
            case 5:
                System.out.println("Thank you for  Visiting ");
                break;

        }

    }

    // ArrayList
    private static void learn_arraylist(ArrayList<Integer> arr) {

        // now add the elements
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(15);
        arr.add(50);
        System.out.println("Your ArrayList");
        System.out.println(arr);

        // now add at particular index
        int idx = 3;
        System.out.println("Adding element at index " + idx);
        arr.add(idx, 63);
        System.out.println(arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(55);
        arr2.add(32);
        arr2.add(89);
        System.out.println("Given Array 2");
        System.out.println(arr2);
        // now adding arr2 into arr1 the elements
        arr.addAll(arr2);
        System.out.println("After adding array 2");
        System.out.println(arr);
        // adding the other array at a particular index
        // arr.addAll(idx, arr2);

        arr.clone();
        System.out.println("Deleted all the element");

        System.out.println("Element at index 4");
        System.out.println(arr.get(4));

        // we can traverse the arraylist in three differnet ways

        // using for loop -- simple
        // using for each loop
        System.out.println("using For Each loop");
        for (Integer i : arr) {
            System.out.print(i + "  ");
        }

        System.out.println("\nUsing Iterator");

        // using iterator
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

        System.out.println("\nUsing list Iterator");
        // list iterator we can assign the index from where we want to iterate
        ListIterator<Integer> listIterator = arr.listIterator(3);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "  ");
        }

        System.out.println("\nRemoving all the elements of the arraylist");
        // deleting all the elements of the arraylist
        arr.clear();
        System.out.println(arr);

    }

    // Linkedlist
    private static void learn_linkedlist(LinkedList<Integer> linkedlist) {
        // now add the elements
        linkedlist.add(5);
        linkedlist.add(2);
        linkedlist.add(7);
        linkedlist.add(15);
        linkedlist.add(50);
        System.out.println("Your linkedlistayList");
        System.out.println(linkedlist);

        // now add at particular index
        int idx = 3;
        System.out.println("Adding element at index " + idx);
        linkedlist.add(idx, 63);
        System.out.println(linkedlist);

        LinkedList<Integer> linkedlist2 = new LinkedList<>();
        linkedlist2.add(55);
        linkedlist2.add(32);
        linkedlist2.add(89);
        System.out.println("Given linkedlistay 2");
        System.out.println(linkedlist2);
        // now adding linkedlist2 into linkedlist1 the elements
        linkedlist.addAll(linkedlist2);
        System.out.println("After adding linkedlistay 2");
        System.out.println(linkedlist);
        // adding the other linkedlistay at a particular index
        // linkedlist.addAll(idx, linkedlist2);

        linkedlist.clone();
        System.out.println("Deleted all the element");

        System.out.println("Element at index 4");
        System.out.println(linkedlist.get(4));

        // we can traverse the linkedlistaylist in three differnet ways

        // using for loop -- simple
        // using for each loop
        System.out.println("using For Each loop");
        for (Integer i : linkedlist) {
            System.out.print(i + "  ");
        }

        System.out.println("\nUsing Iterator");

        // using iterator
        Iterator<Integer> it = linkedlist.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

        System.out.println("\nUsing list Iterator");
        // list iterator we can assign the index from where we want to iterate
        ListIterator<Integer> listIterator = linkedlist.listIterator(3);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "  ");
        }

        // adding element at first index or place
        System.out.println("Adding element 75 at first");
        linkedlist.addFirst(75);
        System.out.println(linkedlist);

        // adding element at last index
        System.out.println("Adding element 77 at first");
        linkedlist.addFirst(77);
        System.out.println(linkedlist);

        System.out.println("\nRemoving all the elements of the linkedlistaylist");
        // deleting all the elements of the linkedlistaylist
        linkedlist.clear();
        System.out.println(linkedlist);
    }

    // Stack
    private static void learn_stack(Stack<Integer> stk) {
    }

    // Vector
    private static void learn_vector(Vector<Integer> vector) {
    }

}
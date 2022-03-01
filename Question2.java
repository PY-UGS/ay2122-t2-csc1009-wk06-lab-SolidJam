import java.util.*;
//Swap position of 2 elements
public class Question2
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(9);
        ll.add(11);

        int element1 = 3;
        int element2 = 11;
        System.out.println("Linked List Before Swapping :-");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        // Swapping the elements
        swap(ll, element1, element2);
        System.out.println();
        System.out.println();
        System.out.println("Linked List After Swapping :-");
        for (int i : ll) {
            System.out.print(i + " ");
        }
    }
    public static void swap(LinkedList<Integer> list,int ele1, int ele2)
    {
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
        // Returning if the element is not present in the LL
        if (index1 == -1 || index2 == -1) {
            return;
        }
        // Swapping the elements
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}

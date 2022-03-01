import java.util.*;
//Insert an integer into the list while sorting the order
public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> currList = new LinkedList<Integer>();
        currList.add(1);
        currList.add(3);
        currList.add(5);
        currList.add(7);
        currList.add(9);
        currList.add(11);
        System.out.println("List before the change: " + currList);
        addAndSort(currList, 8);
        System.out.println("List after the change: " + currList);
    }
    public static void addAndSort(LinkedList<Integer> list,int addedValue) {
        for (int i = 0; i < list.size(); i++) {
            if (addedValue < list.get(i)) {
                list.add(i, addedValue);
                return;
            }
        }
    }
}

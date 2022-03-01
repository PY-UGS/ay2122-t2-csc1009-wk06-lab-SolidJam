import java.util.*;
/*Not a good idea as HasMap is not really utilised in keeping entries in a sorted manner
A good hash function is essential for hash table performance. A poor choice of hash function
is likely to lead to an excess amount of collisions which will degrade performance significantly.*/
public class Question4 {
    public static void addAndSort(HashMap<Integer, Integer> hashMap, int valueAdded) {
        hashMap.put(hashMap.size(), valueAdded);
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);
        System.out.println("\nThe HashMap before: " + hashMap);
        System.out.println("\nThe HashMap after: ");
        addAndSort(hashMap, 8);
    }
}

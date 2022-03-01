import java.util.*;
 class Question5 {
    public static void main(String[] args){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,1);
        hashMap.put(1,3);
        hashMap.put(2,5);
        hashMap.put(3,7);
        hashMap.put(4,9);
        hashMap.put(5,11);
        System.out.println("\nHashMap before: " + hashMap);
        swap(hashMap, 1,5);
        System.out.println("\nHashMap after swap: " + hashMap);
    }
    public static void swap(HashMap<Integer, Integer> hashMap, int element1, int element2){
        int value = hashMap.get(element2);
        hashMap.put(element2, hashMap.get(element1));
        hashMap.put(element1, value);

        if (element1 ==-1 || element2 == -1){
            return;
        }
    }
}

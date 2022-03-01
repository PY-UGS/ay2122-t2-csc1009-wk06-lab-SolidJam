import java.util.*;
//Comparing a number against generated random numbers inside a LL
public class Question3 {
    public static void main(String[] args) {
        System.out.println(random(1000, 9999, 500));
    }
    public static int random (int listMin, int listMax, int size){
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            newList.add(r.nextInt((listMax -listMin) + 1));
        }
        System.out.println("500 Random integer list: " + newList);
        Random r = new Random();
        int var = r.nextInt((listMax -listMin) + 1);
        for (int i = 0; i < size; i++) {
            if (var == newList.get(i)) {
                System.out.print("Position: ");
                return i;
            }
        }
        System.out.print("Not found: ");
        return -1;
    }
}

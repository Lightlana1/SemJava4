package sem4;
import java.util.ArrayDeque;

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task2 {
    public static ArrayDeque<Integer> ReversArray(int count){
        ArrayDeque<Integer> newArray = new ArrayDeque<>();
        ArrayDeque<Integer> reverseArray = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * (100 - 1));
            newArray.addFirst(rand);
        }
        System.out.println(newArray);

        for (int i = 0; i < count; i++) {
            reverseArray.addFirst(newArray.getFirst());
            newArray.removeFirst();
        }

        return reverseArray;

    }

    public static void main(String[] args) {
        System.out.println(ReversArray(10));
    }
}

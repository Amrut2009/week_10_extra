import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String>fruitList = new ArrayList<>();
        fruitList.add("APPLE");
        fruitList.add("BANANA");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("CHERRY");
        fruitList.add("GRAPES");

        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next()+",");
        }

    }

}

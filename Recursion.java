import java.util.ArrayList;
import java.util.Iterator;

public class Recursion {
    public static void main(String[] args) {
      // create an ArrayList
      ArrayList<Integer> arrayList = new ArrayList<>();
      // add some elements to the ArrayList
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(3);
      arrayList.add(4);
      arrayList.add(5);
      // add these codes in the body of main() method after the adding of new element on the ArrayList
      Iterator<Integer> ListElement = null;
      ListElement = arrayList.listIterator(); //where arrayList should be your variable for your previous array list
      // replace your loop code by using the recursion syntax
      recur(ListElement);
    }
    static void recur(Iterator<Integer> ListE) {
      while (ListE.hasNext()) {
        // display the contents of array list using ListE.next()
        // listE is your iterator
        System.out.println(ListE.next());
      }
    }
}

import java.util.ArrayList;

public class MyArraysLab2 {
    public static void main(String[] args) {
        // Initiate an array with at least 5 elements
        int[] arr = {1, 2, 3, 4, 5};
        // Get array length using length function
        int arrLen = arr.length;
        // Declare ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Add element on newly created ArrayList using .add() method
        arrayList.add(6); 
        // Display all the elements of the ArrayList including the newly added element
        for(int i = 0; i < arrLen; i++) {  
            System.out.println(arr[i]); 
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

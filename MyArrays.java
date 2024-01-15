import java.util.Arrays;

public class MyArrays{

    public static void main(String[]args) {
        
        //Initiate an array with at least 5 elements.
        int arr[] = {1, 2, 3, 4, 5};

        //Get array lenght using length function.
        int arrlen = arr.length;

        //Add a new element to the array.
        arr = Arrays.copyOf(arr, arrlen + 1);
        arr[arrlen] = 6;

        //Display all the contents of the array using a loop.
        for(int i = 0; i< arrlen+1; i++) {  
            System.out.println(arr[i]); 
        }
    }
}


public class ArraySolutions3 {
    static int reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the start and end pointers towards each other
            start++;
            end--;
        }
        return 0;
    }
        

}
import java.util.HashSet;
import java.util.Set;

public class ArraySolutions4 {

    public static int[] findUniqueElements(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        
        // Iterate through the array
        for (int num : arr) {
            // Add each element to the set
            uniqueSet.add(num);
        }
        
        // Convert the set back to an array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }
}

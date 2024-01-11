public class ArraySolutions2{
    static int findMinimum(int[] arr) {
            if (arr.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }

         int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        return min;
    }
     static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
public class ArraySolutions5 {

    public static int[] getEvenNumbers(int[] arr) {
        int evenCount = 0;

        // Count the number of even elements in the input array
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // Create an array to store even numbers
        int[] evenArray = new int[evenCount];

        // Populate the evenArray with even numbers from the input array
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }

        return evenArray;
    }
}
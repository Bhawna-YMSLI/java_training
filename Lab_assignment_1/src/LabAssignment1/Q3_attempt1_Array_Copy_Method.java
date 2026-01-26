package LabAssignment1;
//			Task
//public static int[] copyOf(int[] array)

//			Requirements
//Return a new independent array with the same values.
//Do not return the same reference.
//Demonstrate independence by modifying the copied array.

//			Corner Cases
//Empty array → return new empty array
//Single-element array → return new array
public class Q3_attempt1_Array_Copy_Method {

    // Array copy method
    public static int[] copyOf(int[] array) {

        // Handle empty array
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        // Original array
        int[] original = {1, 2, 3, 4};

        // Copy array
        int[] copied = copyOf(original);

        // Modify copied array to prove independence
        copied[0] = 99;

        System.out.println("Original array:");
        printArray(original);

        System.out.println("Copied array:");
        printArray(copied);

        // Empty array case
        int[] empty = {};
        int[] emptyCopy = copyOf(empty);
        System.out.println("Empty array length: " + emptyCopy.length);

        // Single element array
        int[] single = {10};
        int[] singleCopy = copyOf(single);
        singleCopy[0] = 50;

        System.out.println("Single element original: " + single[0]);
        System.out.println("Single element copy: " + singleCopy[0]);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


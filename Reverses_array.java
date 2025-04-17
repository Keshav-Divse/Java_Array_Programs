public class Reverses_array {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nReversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
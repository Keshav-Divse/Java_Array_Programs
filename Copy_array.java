public class Copy_array {
    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
    
}

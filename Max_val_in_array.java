public class Max_val_in_array {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 32, 77};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}

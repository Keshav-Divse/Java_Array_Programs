public class Array_sum {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int sum = 0;  
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }
}

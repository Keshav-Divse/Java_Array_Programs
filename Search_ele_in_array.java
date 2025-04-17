public class Search_ele_in_array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int target = 40;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

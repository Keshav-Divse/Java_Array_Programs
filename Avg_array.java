public class Avg_array {
    public static void main(String[] args) {
        double[] values = {10.5, 20.0, 30.25, 40.75, 50.0};

        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        double average = sum / values.length;

        System.out.println("Average of the array values: " + average);
    }
}

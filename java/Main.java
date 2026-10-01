public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        int k = 5;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        System.out.println((double) windowSum / k);

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i];

            windowSum = windowSum - arr[i - k];

            double average = (double) windowSum / k;

            System.out.println(average);
        }
    }
}

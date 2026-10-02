public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};

        int target = 7;

        int left = 0;
        int sum = 0;
        int minLength = arr.length + 1;

        for (int right = 0; right < arr.length; right++) {

            // Expand the window
            sum = sum + arr[right];

            // Shrink the window
            while (sum >= target) {

                int length = right - left + 1;

                minLength = Math.min(minLength, length);

                sum = sum - arr[left];

                left++;
            }
        }

        if (minLength == arr.length + 1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Minimum length = " + minLength);
        }
    }
}

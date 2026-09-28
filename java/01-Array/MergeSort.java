public class MergeSort {

    // Merge Sort uses divide and conquer to sort the array.`r`n    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            b[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            }
            else {
                arr[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 1, 4, 2, 7};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

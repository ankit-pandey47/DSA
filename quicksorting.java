public class quicksorting {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int j = start;
        int i = start - 1;

        while (j < end) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void quicksort(int arr[], int start, int end) {
        if (start > end)
            return;
        int pi = partition(arr, start, end);
        quicksort(arr, start, pi - 1);
        quicksort(arr, pi + 1, end);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 2, 7, 3, 4, 9, 6, 4 };

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

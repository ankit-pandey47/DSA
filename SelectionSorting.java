import java.util.*;

public class SelectionSorting {
    public static void main(String[] args) {

        int arr[] = { 1, 5, 2, 6, 3, 1, 0, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

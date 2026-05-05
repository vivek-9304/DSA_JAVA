package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        mergeSort(x);
        for (int i : x) {
            System.out.print(i + " ");
        }
    }

    static void mergeSort(int[] arr) {
        int n = arr.length, idx = 0;
        if (n == 1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }

    static void merge(int[] arr, int[] brr, int[] crr) {
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] >= brr[j]) {
                crr[k++] = brr[j++];
            } else {
                crr[k++] = arr[i++];
            }
        }
        while (i < arr.length) {
            crr[k++] = arr[i++];
        }
        while (j < arr.length) {
            crr[k++] = brr[j++];
        }
    }
}

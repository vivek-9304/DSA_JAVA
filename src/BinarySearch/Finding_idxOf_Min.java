package BinarySearch;

public class Finding_idxOf_Min {
    static int Min(int[] arr) {
        //Finding min of cyclic type Array
        int start = 0, end = arr.length - 1;
        while (end > start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) start = mid + 1;
            else end = mid;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4};
        System.out.println(Min(arr));
    }
}

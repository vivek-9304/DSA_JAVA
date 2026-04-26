package BinarySearch;

public class PeakOf_MountainArray {
    static int peak(int[] arr) {
        int start = 1, end = arr.length - 2;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                return arr[mid];
            } else if ((arr[mid] < arr[mid + 1]) && (arr[mid] > arr[mid - 1])) start = mid + 1;
            else end = mid - 1;
        }
        return -999;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 7, 8, 12, 34, 45, 67, 76, 87, 76, 67, 45, 34, 12};
        System.out.println("peak = " + peak(arr));
    }
}

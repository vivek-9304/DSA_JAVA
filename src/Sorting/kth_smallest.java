package Sorting;

import java.util.Scanner;

public class kth_smallest {
    //Kth element without inbuilt sort
    static int smallest(int[] arr, int k) {
        // using algorithm of selectin sort
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE, idx = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        return arr[k - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {22, 2, 5, 7, 4, 8, 3, 45, 5, 11, 12, 17, 21, 34};
        int k = sc.nextInt();
        System.out.println(smallest(arr, k));
    }
}

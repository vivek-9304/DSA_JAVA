package Arrays;

public class MinMax {

    static int Max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int Min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] arr = {2,4,7,5,543,453,413,98,2,323,55};
        System.out.println("Maximum is : "+Max(arr));
        System.out.println("Minimum is : "+Min(arr));
    }
}

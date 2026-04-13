package Arrays;
import java.util.Arrays;
public class Adding_one {
    // Function that add one to the array assuming its being written as a regular serial number
    static int[] Add_One(int[] arr){
        int n = arr.length, i=1;
        if(arr[n-1]!=9){
            arr[n-1]++;
        }else{
            while(arr[n-i]==9){
                arr[n-i]=0;
                i++;
            }
            arr[n-i]++;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,1};
        int[] brr = {8,4,9,9};
        System.out.println(Arrays.toString(Add_One(arr)));
        System.out.println(Arrays.toString(Add_One(brr)));
    }
}

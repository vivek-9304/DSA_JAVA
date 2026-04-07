package Arrays;

import java.util.*;
public class Segregate_0_and_1 {
    static int[] Num(){
        int[] arr = {0,0,1,1,1,0,0,1,0,1,1,0,0,1,0};
        int i=0, j=arr.length-1, temp;
        while(j>i){
            if(arr[i]==1 && arr[j]==0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }else if(arr[i]==1 && arr[j]==1){
                j--;
            }else if(arr[i]==0 && arr[j]==0){
                i++;
            }else{
                i++; j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = Num();
        for(int i : num){
            System.out.print(i+" ");
        }
    }
}

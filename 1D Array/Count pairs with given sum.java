import java.io.*;
import java.util.*;

public class Main{
    public static void getPairsCount(int arr[],int target) {
        int n=arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        getPairsCount(arr,target);
    }
}

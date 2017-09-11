import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        long big = sum-arr[arr.length-1];
        long small = sum-arr[0];
        System.out.println(big+" "+small);
    }
}

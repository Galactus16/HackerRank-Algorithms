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
        
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(min >= arr[i])
                min = arr[i];
            if(max <= arr[i])
                max = arr[i];
        }
        
        System.out.println((sum-max)+" "+(sum-min));
    }
}

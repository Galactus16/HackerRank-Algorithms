import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        float[] res = calPerc(arr);
        for(int i=0; i < res.length; i++){
            System.out.printf("%.6f\n",res[i]);
        }
    }
    
    static float[] calPerc(int[] a){
        
        int pos_count = 0;
        int neg_count = 0;
        int zero_count = 0;
        
        for(int i=0; i<a.length;i++){
            if(a[i]>0)
                pos_count++;
            else if(a[i] < 0)
                neg_count++;
            else if(a[i] == 0)
                zero_count++;
        }
        
        float[] f = {(float)pos_count/a.length, (float)neg_count/a.length, (float)zero_count/a.length};
        return f;
    }
}

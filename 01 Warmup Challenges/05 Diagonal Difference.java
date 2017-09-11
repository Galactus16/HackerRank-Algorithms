import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        System.out.println(diagonal(a));
    }
    
    static int diagonal(int[][] a){
        int left_sum = 0;
        int right_sum = 0;
        
        for(int r=0;r<a.length;r++){
            left_sum += a[r][r];
        }
        
        for(int r=0;r<a.length;r++){
            right_sum += a[r][a.length-1-r];
        }
        
        return Math.abs(left_sum - right_sum);
    }
}

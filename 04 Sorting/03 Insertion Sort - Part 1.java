import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        int temp = ar[ar.length - 1];
        ar[ar.length - 1] = ar[ar.length - 2];
        int i = ar.length - 2;
        while(temp <= ar[i] && i >= 0) {
            ar[i+1] = ar[i];
            for(int x : ar)
                System.out.print(x+" ");
            System.out.println();
            i--;
            if(i == -1) break;
        }
        ar[i+1] = temp;
        
        for(int x : ar)
         System.out.print(x+" ");
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

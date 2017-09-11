import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Arrays.sort(unsorted, new Comparator<String>(){
           
            public int compare(String a, String b){
                return stringAsIntegerCompare(a,b);
            }
        });
        
        //Print the output
        StringBuilder sb = new StringBuilder("");
        for(String x : unsorted){
           sb.append(x+"\n");
        }
        
        System.out.println(sb.toString());
    }
    
    static int stringAsIntegerCompare(String a,String b){
        if(a.length() > b.length()) return 1;
        if(a.length() < b.length()) return -1;
        
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) > b.charAt(i)) return 1;
            if(a.charAt(i) < b.charAt(i)) return -1;
        }
        
        return 0;
    }
}

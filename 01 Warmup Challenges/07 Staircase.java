import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<=n;i++){
           sb.append(" ");
        }
        int j=0;
        for(int i=1;i<=n; i++){
            sb.replace(n-i,n-j,"#");
            j++;
            System.out.println(sb.toString());
        }
    }
}

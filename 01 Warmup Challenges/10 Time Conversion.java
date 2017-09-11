import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        char c = s.charAt(8);
        StringBuilder time = new StringBuilder();
        
        if(c=='A' || c=='a'){
            if(hour == 12){
                time.append("00").append(s.substring(2,8));
            }else{
                time.append(s.substring(0,8));
            }
        }
        
        if(c =='P' || c =='p'){
            if(hour == 12){
                time.append(s.substring(0,8));
            }else{               
                hour += 12;
                time.append(hour).append(s.substring(2,8)); 
            }
        }
        
        return time.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

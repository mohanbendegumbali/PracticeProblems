package com.bridgelabz;
import java.util.*;

public class TwoString {
       public static void main(String args[]) {
    	   String str1, str2;
    	   Scanner scan = new Scanner(System.in);
    	   
    	   System.out.println("Enter the first string");
    	   str1 = scan.nextLine();
    	   System.out.println("Enter the second string");
    	   str2 = scan.nextLine();
    	   
    	   if(str1.equals(str2)) {
    		   System.out.println(" Both strings are equal");
    	   }
    		   else {
    			   System.out.println(" Both strings are not equal");
    		   }
    	   
       }
}

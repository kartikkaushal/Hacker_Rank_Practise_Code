package com.home.hacekerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class RecursiveMethod {
	
public static class RecursviveMethod {

	    // Complete the factorial function below.
	
	   static int factorial(int n) {
		   if(n==0) {
			   return 1;
		   }else {
			   return (n*factorial(n-1)); 
		   }
	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	     //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:/New folder/try.txt")));
	    	
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int result = factorial(n);

	       // bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        //bufferedWriter.close();
	        System.out.print(result);
	        scanner.close();
	    }
	}


}

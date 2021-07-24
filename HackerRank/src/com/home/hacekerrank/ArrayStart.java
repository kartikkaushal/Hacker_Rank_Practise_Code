package com.home.hacekerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayStart {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		/*
		 * for (
		 * }int i = 0; i < n; i++) { int arrItem = Integer.parseInt(arrItems[i]);
		 * arr[i] = arrItem;
		 * 
		 */
        for(int i=arrItems.length-1;i>=0;i--){
        	//int j=arr.length-1;
             System.out.print(arrItems[i]);
             System.out.print(" ");
             
        }
        
               

        scanner.close();
    }
}


package com.home.hacekerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n>=2 && n<=20)
        {
        	for(int i=1;i<=10;i++)
        	{
        	int j = n*i;
        	System.out.println(n+"x"+i+"="+j);
        	}
        }
        scanner.close();
    
}
}

package com.home.hacekerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEvenString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan=new Scanner(System.in);
    	int	T=scan.nextInt();
    	for(int i=0;i<T;i++) {
    		String S=scan.next();
    		int Strlength=S.length();
    		int k=0;
    		int y=0;
    		
    		char c[]=S.toCharArray();
    		
    		char e[]=new char[Strlength];
    		char o[]=new char[Strlength];
    		if(Strlength>1 && Strlength<=1000) {
    			for(int j=0;j<Strlength;j++) {
    				if(j%2==0) {
    					e[k]=S.charAt(j);
    					k++;
    				}else {
    					o[y]=S.charAt(j);
    					y++;
    				}    			}
    		}
    		for(int s=0;s<k;s++)
    		{System.out.print(e[s]);
    		}
    		System.out.print(" ");
    		for(int p=0;p<y;p++)
    		{System.out.print(o[p]);
    		}
    		System.out.println();
    		
    	}
    }
}

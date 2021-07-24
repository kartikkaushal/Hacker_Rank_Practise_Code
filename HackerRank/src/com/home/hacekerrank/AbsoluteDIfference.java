package com.home.hacekerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
	
  	
  	int diff=0;
	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
  		this.elements=a;
	}
	private int[] elements;
  	public int maximumDifference;
	public void computeDifference() {
		// TODO Auto-generated method stub
		for(int i=0;i<elements.length;i++){
			for(int j=0;j<elements.length;j++){
			if(j!=i){
			diff=elements[i]-elements[j];
			}
			if( diff>maximumDifference){
			maximumDifference=diff;
			}
			}
			}
			}
	

	// Add your code here

} // End of Difference class

public class AbsoluteDIfference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

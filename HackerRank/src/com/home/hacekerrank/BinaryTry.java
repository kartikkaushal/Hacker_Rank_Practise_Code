package com.home.hacekerrank;

public class BinaryTry {

	public static void main(String[] args) {
		int a[]=new int[10];
		int i=-1;
		int count=0;
	    	int n=10;
	    	for(n=n;n>=1;){
	    		int s=n%2;
	    		n=n/2;
	    		i++;
	    		a[i]=s;
	    	}
	    	for(int k=a.length-1;k>=0;k--) {
	    		int j=a[k];
	    		for(int y=0;y<k;y++) {
	    		System.out.println(j);
	    		}
	    		if(j!=0) {
	    			count++;
	    		}
	    	}	    
	    	System.out.println("count="+count);
	}

}

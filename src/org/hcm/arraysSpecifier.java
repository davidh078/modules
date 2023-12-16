package org.hcm;

public class arraysSpecifier {
public static void main(String[] args) {
	int a[]=new int [5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	//to find the length
	
	int b=a.length;
	System.err.println(b);
	///o get the particular number array

	//for looping
	//looping
	System.out.println("for  looping");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	//for each looping
		System.out.println("enhanced looping");
		for(int c:a) {
			System.out.println(c);
		}
		
	}
}


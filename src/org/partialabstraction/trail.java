package org.partialabstraction;

import java.util.Scanner;

public class trail {

	public static void main(String[] args) {
		
		int [] num= {12,15,16,18};
		int src=0;
		int desc=3;
		int temp= num[src];
		num[src]=num[desc];
		num[desc]=temp;
		for(int i=0;i<num.length;i++ )
			System.out.println(num[i]+" ");
		System.out.println(num[3]);
		


	}

}

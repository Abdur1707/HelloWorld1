package com.practice;
import java.util.*;
public class Palindrome {

	public static boolean ispalin(String s) {
		int l=s.length();
		for(int i=0;i<l/2;i++) {
			if(s.charAt(i)!=s.charAt(l-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        long start=System.nanoTime();
        if(ispalin(s)) {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not palindrome");
        }
        long end=System.nanoTime();
        System.out.print("Total time:");
        System.out.println((end-start) + " ns OR " + (end-start)/1000 + " micro sec");
      
	}

}

// 1 sec = 1000 ms
// 1 ms = 1000 micro S
// 1 micro sec = 1000 ns
// 1 ns = .0000000001 sec

package com.practice;
import java.util.*;
public class prime2 {
	
//		for(int i=1;i<=n;i++) {
//			
//			int flag=0;
//			for(int j=2;j<=i;j++) {
//				if(i%j==0) {
//					flag=1;
//				break;
//				}
//			}
//			
//			if(flag==0) {
//				System.out.println(i);
//			}
//			
//		}
//	}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the value of n");
//	int n=sc.nextInt();
//	isprime(n);
//	
//}
//}

		

			 public static void main(String[] args) {

			  int num = 20, count;

			  for (int i = 1; i <= num; i++) {
				  if(i==0||i==1)
					  continue;
			   count = 0;
			   for (int j = 2; j<=i/j; j++) {
			    if (i % j == 0) {
			     count++;
			     break;
			    }
			   }

			   if (count == 0) {
			    System.out.println(i);
			   }

			  }
			 }
			}	
		
		

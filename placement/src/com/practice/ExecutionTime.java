package com.practice;

import java.time.Duration;
import java.time.Instant;

class ExecutionTime {
    public static int  countPrimes(int n) {
     int count=0;
     System.out.print("Prime Numbers Using Simple Method are : "); 
    for(int i=2;i<n;i++){
        if(isPrime(i)) count++;
    }
     System.out.println("\nNo. of Primes less than "+n + " : " + count);
     return count;
    }
    
    private static boolean isPrime(int num){
        if( num!=2 && num%2 == 0){
           return false; 
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
     System.out.print(num + " "); 
     return true;
    }

	private static int countPrimesBySieveOfEratosthenes(int n) {
		 boolean prime[] = new boolean[n + 1];
	        for (int i = 0; i <= n; i++)
	            prime[i] = true;
	        for (int p = 2; p * p <= n; p++) { // if square exist in array?
	            if (prime[p] == true) { // If not already false?
	                for (int i = p * p; i <= n; i += p) // start from  square of number
	                    prime[i] = false;
	            }
	        }
	        int count=0;
	        //System.out.print("Prime Numbers Using SieveOfEratosthenes are : "); 
	        for (int i = 2; i < n; i++) { 
	            if (prime[i] == true) {
	                count++;
	                //System.out.print(i + " ");
	            }
	        }
	        //System.out.println("\ncount " + count);
	        return count;
	}
	
    public static void main(String args[]) {
    	Instant totalStartTime = Instant.now();

    	try {
    	int arr[] = new int[]{ 100000 };
    	for(int i=0; i<arr.length;i++) {
    		Instant countPrimesStartTime = Instant.now();
    		int countPrimes= countPrimes(arr[i]); //
    		Instant countPrimesEndTime = Instant.now();
    		Duration timeTaken = Duration.between(countPrimesStartTime, countPrimesEndTime);
        	System.out.println("***********\ncountPrimes Time Taken: " + timeTaken);
        	
        	Instant countPrimes2StartTime = Instant.now();
    		int countPrimes2= countPrimesBySieveOfEratosthenes(arr[i]); //
    		Instant countPrimes2EndTime = Instant.now();
    		Duration timeTaken2 = Duration.between(countPrimes2StartTime, countPrimes2EndTime);
    		System.out.println("***********\ncountPrimesBySieveOfEratosthenes Time Taken: " + timeTaken2 +"\n**************");
    		
	    	if(countPrimes == countPrimes2) {
	    		System.out.println(arr[i] + " : Test Passed."); 
	    	} else {
	    		System.out.println(arr[i] + " : Test Failed."); 
	    	}
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    		
    	}
    	Instant totalEndTime = Instant.now();
    	Duration res2 = Duration.between(totalStartTime, totalEndTime);
    	
    	System.out.println("\n*************\ntotalStartTime : " + totalStartTime + "\ntotalEndTime : "+ totalEndTime + "\nTime Taken: " + res2);
    	
    }
}


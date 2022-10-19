package com.practice;

class PrimeLessThanN {
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
    
    public static void main(String args[]) {
    	try {
    	int arr[] = new int[]{ 29 };
    	for(int i=0; i<arr.length;i++) {
    		
	    	if(countPrimes(arr[i]) == countPrimesBySieveOfEratosthenes(arr[i])) {
	    		System.out.println(arr[i] + " : Test Passed."); 
	    	} else {
	    		System.out.println(arr[i] + " : Test Failed."); 
	    	}
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    		
    	}
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
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println("\ncount " + count);
	        return count;
	}
}


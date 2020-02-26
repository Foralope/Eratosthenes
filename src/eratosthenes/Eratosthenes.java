/*
 * William Z
 * This program will filter out all non prime numbers from 1 to 1000.
 */

package eratosthenes;

/**
 *
 * @author wizwa9381
 */
public class Eratosthenes {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        //Variables
        int remainder;
        boolean primeChecker = true;
        String primeNumbers = "";
        //For loop to check if the number is prime by dividing all the numbers from 2 to 1000 by all of the numbers
        //by 2 to half of the number from the earlier step to see if there is no remainder, which means it is not prime.
        for(int i = 2;i <= 1000;i++){
            for (int ii = 2;ii <= i/2;ii++) {
                remainder = i%ii;
                //if the remainder is 0 then the number is not prime, so it is not added to the list of primes.
                if(remainder == 0){
                    primeChecker = false;
                }
                //Adding 2 to the primes as the program will not catch it.
                if(i == 2){
                    primeChecker = true;
                }
            }
            //If it passed the remainder test, the number is prime.
            if(primeChecker == true){
                primeNumbers += i+" is a prime number\n";
            }
            //Setting primeChecker back to true again so it will catch more primes.
            primeChecker = true;
        }
        // Print prime numbers from 1 to 1000
        System.out.println(primeNumbers);
    }
    
}
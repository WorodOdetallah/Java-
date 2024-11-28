/**
 * a) we need to Find two numbers p1 and p2 such that p1+p2=n
 * check small primes p1, calculate p2=n-p1, and ensure both are prime. Print : n= p1 + p2
 *
 * b) Find two primes p3 and p4 where p4 - p3 =n
 * we can start with small primes p1 , calculate p4=p3 + n , and check if both are prime. print : n=p4 -p3
 *
 * c) count and list all prime numbers less than n. so we need to check each number from 2 to n-1 then count and save the primes
 * print : x prime numbers is [2,n): [list of primes]
 *
 * d) Break n into its prime factors
 * Divide n by primes starting from 2 until n=1
 * print : n = q1 * q2 *... *qk
 */

/**
 * Pseudocode for Requirements
 * a) Find p1 and p2 such that p1+p2 = n
 * Input: n (even number > 4)
 * If n <= 4 or n is odd:
 *     Print "Error: Invalid input"
 *     Exit
 *
 * For p1 from 2 to n:
 *     If isPrime(p1):
 *         p2 = n - p1
 *         If isPrime(p2):
 *             Print "n = p1 + p2"
 *             Exit
 *
 * b) Find p3 and p4 such that p4 - p3 =n
 * Input : n (even number > 4)
 *
 * for p3 from 2 to n:
 * IF isPrime(p3):
 *     p4 = p3 + n
 *     IF isPrime(p4):
 *          Print " n = p4 - p3"
 *          Exit
 *
 * c) Count primes in [2,n) and list them
 * Input: n (even number > 4)
 * Initialize count = 0
 * Initialize primes = []
 *
 * For i from 2 to n-1:
 *     If isPrime(i):
 *         Add i to primes
 *         Increment count
 *
 * Print "count prime numbers in [2, n): primes"
 *
 * d) compute prime factorization of n
 *
 * Input: n (even number > 4)
 * Initialize factors = []
 * temp = n
 *
 * For factor from 2 to n:
 *     While temp % factor == 0:
 *         Add factor to factors
 *         temp = temp / factor
 *     If temp == 1:
 *         Break
 *
 * Print "n = factors"
 */

/**
 * Ex0.java
 * ID:[211639596]
 * name : odetallah worod
 */

import java.util.ArrayList;

public class Ex0 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 30;
        int ID = 211639596;

        if (n <= 4 || n % 2 != 0 || n >= 100000000) {
            System.out.println("Error: Invalid input");
            return;
        }


        // a) Find two primes such that p1 + p2 = n
        for (int p1 = 2; p1 <= n; p1++) {
            if (isPrime(p1)) {
                int p2 = n - p1;
                if (isPrime(p2)) {
                    System.out.println(n + " = " + p1 + " + " + p2);
                    break;
                }
            }
        }

        // b) Find two primes such that p4 - p3 = n
        boolean found = false;
        for (int p3 = 2; p3 < n; p3++) {
            if (isPrime(p3)) {
                int p4 = p3 + n;
                if (isPrime(p4)) {
                    System.out.println(n + " = " + p4 + " - " + p3);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No prime pair found where p4 - p3 = " + n);
        }

        // c) Count the number of primes in [2, n) and list them
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes.size() + " prime numbers in [2," + n + "): " + primes);

        // d) Prime decomposition of n
        int temp = n;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int factor = 2; temp > 1; factor++) {
            while (temp % factor == 0) {
                factors.add(factor);
                temp /= factor;
            }
        }
        System.out.print(n + " = ");
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i < factors.size() - 1) System.out.print(" * ");
        }
        System.out.println();

        // e) Program runtime and ID
        // I can write it in another way i just decide to go with it .

        long endTime = System.currentTimeMillis();
        System.out.println("Runtime: " + (endTime - startTime) / 1000.0 + " seconds");
        System.out.println(ID);
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

/**
 * /Users/worododetallah/Library/Java/JavaVirtualMachines/openjdk-22/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=65222:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/worododetallah/IdeaProjects/EXX0/out/production/EXX0 Ex0
 * 30 = 7 + 23
 * 30 = 37 - 7
 * 10 prime numbers in [2,30): [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
 * 30 = 2 * 3 * 5
 * Runtime: 0.012 seconds
 * 211639596
 *
 * Process finished with exit code 0
 */

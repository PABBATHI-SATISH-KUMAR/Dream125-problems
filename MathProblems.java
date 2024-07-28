// 1) print the factors of a given number
// 2) Check whether the two numbers are amicable numbers are not
// write a java program to check whether it is a PerfectNumber or not 




public class MathProblems {
    public static void main(String[] args) {
        //1
        // printFactors(36);

        //2
        // int n1 = 120;  
        // int n2 = 184;  

        // if (areAmicablePairs(n1, n2)) {
        //     System.out.println(n1 + " and " + n2 + " are amicable pairs.");
        // } else {
        //     System.out.println(n1 + " and " + n2 + " are not amicable pairs.");
        // }


        //3
        // int num = 14;

        // if (isPerfectNumber(num)) {
        //     System.out.println(num + " is a perfect number.");
        // } else {
        //     System.out.println(num + " is not a perfect number.");
        // }

        //4
        int n = 36;  // Example number for prime factorization
        primeFactorization(n);
    }
    // 1) print the factors of a given number
    public static void printFactors(int n) {
        for (int factor = 1; factor <= n / 2; factor++) {
            if (n % factor == 0) {
                System.out.print(factor + " ");
            }
        }
        System.out.print(n + " ");
    }



// 2) Check whether the two numbers are amicable numbers are not
    public static int sumOfFactors(int n) {
        int sumOfFactors = 1;
        int sqrt = (int) Math.sqrt(n);

        for (int factor = 2; factor <= sqrt; factor++) {
            if (n % factor == 0) {
                sumOfFactors += factor + n / factor;
            }
        }
        if (sqrt * sqrt == n) {
            sumOfFactors -= sqrt;
        }

        return sumOfFactors;
    }

    public static boolean areAmicablePairs(int n1, int n2) {
        int sumOfFactors1 = sumOfFactors(n1);
        int sumOfFactors2 = sumOfFactors(n2);

        return sumOfFactors1 == n2 && sumOfFactors2 == n1;
    }



// 3)write a java program to check whether it is a PerfectNumber or not 
    public static boolean isPerfectNumber(int num) {
        if (num < 2) {
            return false; 
        }
        int sumOfFactors = 1; 
        for (int factor = 2; factor <= num / 2; factor++) {
            if (num % factor == 0) {
                sumOfFactors += factor;
            }
        }
        return num == sumOfFactors;
    }



    public static void primeFactorization(int n) {
        int pf = 2; // Start with the smallest prime factor

        while (n > 1) {
            if (n % pf == 0) {
                System.out.print(pf + " "); // Print the prime factor

                // Divide n by pf as long as pf is a factor
                while (n % pf == 0) {
                    n /= pf;
                }
            }
            pf++; // Move to the next potential prime factor
        }
    }
}

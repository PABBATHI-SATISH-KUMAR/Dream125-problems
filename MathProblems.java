// 1) write a java program print the factors of a given number
// 2) write a java program Check whether the two numbers are amicable numbers are not
// 3) write a java program to check whether it is a PerfectNumber or not 
// 4) Write a java program for the primeFactorization
// 5) write a java program for the largestFactor 
// 6) Write a java program for the kthLargestFactor
// 7) write a java program for the numberOfCommonFactor
// 8) Write a java program for the largestPrimeFactor
// 9) write a java program to findGCD, that computes the greatest common divisor (GCD) of the smallest and largest numbers in the array.
// 10) Write a java program to find the sum of factors
// 11) Write a java program for the sum of square numbers
// 12) Write a java program to the sum of first N odd numbers
// 13) Write a java program to the sum of first N even numbers
// 14) Write a java program to check whether a given number is a strong number or not 
// 15) write a java program to check whether a given number is a smith number or not
// 16) Write a java program for small possible number divisible by N  ---- 
// 17) write a java program to find the reverse of a number
// 18) Write a java program to return two prime numbers -----
// 19)  write a java program print the factors of a given number in a ascending order 
// 20) Write a java program for the oddeven segregation
import java.util.Arrays;

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
        // int n = 36;  
        // primeFactorization(n);

        //5
        // int num = 28;  
        // int largestFactor = largestFactor(num);
        // System.out.println("The largest factor of " + num + " (other than itself) is: " + largestFactor);


        //6
        // int n = 100; 
        // int k = 3;   
        // int result = kthLargestFactor(n, k);
        
        // if (result != -1) {
        //     System.out.println("The " + k + "-th largest factor of " + n + " is: " + result);
        // } else {
        //     System.out.println("There are less than " + k + " factors of " + n);
        // }


        //7
        // int n1 = 36;
        // int n2 = 60;
        // int commonFactorsCount = numberOfCommonFactors(n1, n2);
        // System.out.println("The number of common factors between " + n1 + " and " + n2 + " is: " + commonFactorsCount);



        //8
        // int n = 100;
        // int largestPrime = largestPrimeFactor(n);
        // System.out.println("The largest prime factor of " + n + " is: " + largestPrime);


        //9
        // int[] nums = {48, 64, 80, 32, 96};
        // int gcd = findGCD(nums);
        // System.out.println("The GCD of the smallest and largest numbers in the array is: " + gcd);


        // //10
        // int num = 28;
        // int sumOfFactors = calculateSumOfFactors(num);
        // System.out.println("The sum of the factors of " + num + " is: " + sumOfFactors);


        //11
        // int n = 2;  
        // int sumOfSquares = calculateSumOfSquares(n);
        // System.out.println("The sum of squares of the first " + n + " natural numbers is: " + sumOfSquares);

        //12
        // int N = 5;  
        // int sumOfOddNumbers = calculateSumOfOddNumbers(N);
        // System.out.println("The sum of the first " + N + " odd numbers is: " + sumOfOddNumbers);


        //13
        // int N = 5; 
        // int sumOfEvenNumbers = calculateSumOfEvenNumbers(N);
        // System.out.println("The sum of the first " + N + " even numbers is: " + sumOfEvenNumbers);


        //14
        // int number = 145;
        // if (isStrongNumber(number)) {
        //     System.out.println(number + " is a strong number.");
        // } else {
        //     System.out.println(number + " is not a strong number.");
        // }


        //15
        // int number = 666;
        // if (isSmithNumber(number)) {
        //     System.out.println(number + " is a Smith number.");
        // } else {
        //     System.out.println(number + " is not a Smith number.");
        // }


        //16




        //17
        // int number = 1443;
        // int reversedNumber = reverseNumber(number);
        // System.out.println("The reverse of the number " + number + " is: " + reversedNumber);



        //18


        //19
        // int number = 28;
        // System.out.println("The factors of " + number + " are:");
        // printFactorsAsc(number);



        //20
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        segregateOddEven(numbers);











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


// 4) Write a java program for the primeFactorization
    public static void primeFactorization(int n) {
        int pf = 2; 

        while (n > 1) {
            if (n % pf == 0) {
                System.out.print(pf + " "); 

                
                while (n % pf == 0) {
                    n /= pf;
                }
            }
            pf++; 
        }
    }



    // 5) write a java program for the largestFactor 
    public static int largestFactor(int num) {
        
        for (int i = num / 2; i >= 2; i--) {
            if (num % i == 0) {
                return i; 
            }
        }
        return 1; 
    }



    // 6) Write a java program for the kthLargestFactor
    
    public static int kthLargestFactor(int n, int k) {
        int count = 0;

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        
        return -1;
    }



    // 7) write a java program for the numberOfCommonFactor
    public static int numberOfCommonFactors(int n1, int n2) {
        int count = 0;

        // Ensure n1 is the smaller number
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        // Check factors from 1 up to n1
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                count++;
            }
        }

        return count;
    }


    // 8) Write a java program for the largestPrimeFactor
    public static int largestPrimeFactor(int n) {
        int max = -1;

        
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }

        
        for (int pf = 3; pf <= n / 2; pf += 2) {
            while (n % pf == 0) {
                max = pf;
                n /= pf;
            }
        }

        
        if (n > 2) {
            max = n;
        }

        return max;
    }


     // 9) write a java program to findGCD, that computes the greatest common divisor (GCD) of the smallest and largest numbers in the array.

     public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int GCD = 1;
        for (int i = 1; i <= nums[0]; i++) {
            if (nums[0] % i == 0 && nums[nums.length - 1] % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }


    // 10) Write a java program to find the sum of factors
    public static int calculateSumOfFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { 
                sum += i;       
            }
        }

        return sum;
    }


    // 11) Write a java program for the sum of square numbers
    public static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }


    // 12) Write a java program to the sum of first N odd numbers
    public static int calculateSumOfOddNumbers(int N) {
        int sum = 0;
        int currentOddNumber = 1;

        for (int i = 0; i < N; i++) {
            sum += currentOddNumber;  
            currentOddNumber += 2;    
        }

        return sum;
    }



    // 13) Write a java program to the sum of first N even numbers

    public static int calculateSumOfEvenNumbers(int N) {
        int sum = 0;
        int currentEvenNumber = 2;

        for (int i = 0; i < N; i++) {
            sum += currentEvenNumber;  
            currentEvenNumber += 2;    
        }

        return sum;
    }


    // 14) Write a java program to check whether a given number is a strong number or not

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    // 15) write a java program to check whether a given number is a smith number or not
    
    public static boolean isSmithNumber(int number) {
        if (isPrime(number)) {
            return false; 
        }

        int sumOfDigits = sumDigits(number);
        int sumOfPrimeFactorDigits = sumPrimeFactorDigits(number);

       
        return sumOfDigits == sumOfPrimeFactorDigits;
    }

 
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;

        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    
    public static int sumPrimeFactorDigits(int number) {
        int sum = 0;

       
        while (number % 2 == 0) {
            sum += sumDigits(2);
            number /= 2;
        }

        
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                sum += sumDigits(i);
                number /= i;
            }
        }

        if (number > 2) {
            sum += sumDigits(number);
        }

        return sum;
    }


    // 16) Write a java program for small possible number divisible by N 


// 18) Write a java program to return two prime numbers -----



    // 17) write a java program to find the reverse of a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return reversed;
    }




    // 19)  write a java program print the factors of a given number in a ascending order 
    public static void printFactorsAsc(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line after printing all factors
    }




    // 20) Write a java program for the oddeven segregation
    public static void segregateOddEven(int[] numbers) {
        System.out.println("Even numbers:");

      
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nOdd numbers:");

        
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }



}

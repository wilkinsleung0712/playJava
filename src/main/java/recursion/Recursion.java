package recursion;

public class Recursion {


//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
//
//
//    factorial(1) → 1
//    factorial(2) → 2
//    factorial(3) → 6
    public static int factorial(int n) {

        if(n == 1) {
            return 1;
        }

        return n * Recursion.factorial(n - 1);
    }




//    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
//
//
//    bunnyEars(0) → 0
//    bunnyEars(1) → 2
//    bunnyEars(2) → 4
    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) {
            return 0;
        }
        return bunnyEars(bunnies - 1) + 2;
    }

}

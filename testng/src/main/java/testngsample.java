public class testngsample {
    static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");

            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    static double squareRoot(double number) {
//iterator variable
        int i = 1;
        while (true) {
//for perfect square numbers
            if (i * i == number)
                return i;
//for not perfect square numbers
            else if (i * i > number)
//returns the value calculated by the method decimalSqrt()
                return decimalSqrt(number, i - 1, i);
//increments the variable i by 1
            i++;
        }
    }

    private static double decimalSqrt(double number, double i, double j) {
//calculates the middle of i and j
        double midvalue = (i + j) / 2;
//finds the square of the midvalue
        double square = midvalue * midvalue;
//compares the midvalue with square up to n decimal places
        if (square == number || Math.abs(square - number) < 0.0000001)
            return midvalue;
//if the square root belongs to second half
        else if (square > number)
            return decimalSqrt(number, i, midvalue);
//if the square root belongs to first half
        else
            return decimalSqrt(number, midvalue, j);
    }

    public static void main(String args[]) {
        checkPrime(1);
        double number = 25, sqrt = 0;
        sqrt = squareRoot(number);
        System.out.println("The square root of "+number+ " is " +sqrt);
    }
}

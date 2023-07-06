package lesson3;

import java.util.Arrays;

public class Lesson3HomeWork {

    public static void main(String[] args) {

        System.out.println("Число фибоначи - рекурсия " + fibonacciRecursive(7));;

    }
    public static int fibonacciRecursive(int n) {

        if (n < 2) {
            return n;
        } else {

            {
                //System.out.println("Числа фибоначи - рекурсия " + fibonacciRecursive(n));
                return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            }

        }

    }


}

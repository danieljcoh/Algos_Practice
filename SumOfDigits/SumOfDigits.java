import java.util.*;

public class SumOfDigits {

    //PROBLEM
    //You're given an integer N. Write a program to calculate the sum of all the digits of N. 
    public static void main(String[] args) {
        
        sumOfAllDigits(123);
        sumOfAllDigits(98765);
        sumOfAllDigits(10);


    }

    public static void sumOfAllDigits(int n){

        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (n > 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println(" ");
    }

}
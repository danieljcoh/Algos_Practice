import java.util.*;

public class FirstAndLast {

    //PROBLEM
    //If Give an integer N . Write a program to obtain the sum of the first and last digits of this number. 

    public static void main(String[] args) {
        
        sumOfTwoDigits(1236);
        sumOfTwoDigits(5489);
        sumOfTwoDigits(12345);
        
    }

    public static void sumOfFirstAndLast(int n){

        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0){
            stack.add(n % 10);
        }
        int tempA = stack.get(0);
        int tempB = n % 10;

        System.out.println(tempA + tempB);
    }

    public static void sumOfTwoDigits(int n){

        LinkedList<Integer> stack = new LinkedList<Integer>();
        
        int tempA = n % 10;
        
        while (n > 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        
        int tempB = stack.get(0);

        System.out.println(tempA + tempB);

        // while (!stack.isEmpty()) {
        //     System.out.print(stack.pop());
        // }
        System.out.println(" ");
    }



}
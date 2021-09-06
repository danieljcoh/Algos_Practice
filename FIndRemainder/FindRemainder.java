public class FindRemainder {

    //PROBLEM
    //Write a program to find the remainder when an integer A is divided by an integer B. 
    public static void main(String[] args) {
        
        findRemainder(1,2);
        findRemainder(100,200);
        findRemainder(40,15);

    }

    public static void findRemainder(int a, int b){
        if(a > b){
            System.out.println(a % b);
        } else {
            System.out.println(b % a);
        }
    }
}
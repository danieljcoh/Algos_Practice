public class ATM {
    
    //PROBLEM
    /* 
    Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction 
    if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
    For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction. 
    */
    public static void main(String[] args) {
    
        withdrawXAmount(30, 120.00);
        withdrawXAmount(42, 120.00);
        withdrawXAmount(300, 120.00);


    }

    public static void withdrawXAmount(int withdrawalAmount, double accountBalance){

        if (withdrawalAmount % 5 == 0 && accountBalance > withdrawalAmount){
            System.out.println("You've successfully withdrawn " + withdrawalAmount + ".");
            System.out.println("The bank charged a $.50 fee.");
            double newBalance = accountBalance - withdrawalAmount - .50;
            System.out.println("Your new balance is " + newBalance + ".");
        } else {
            System.out.println("Account amount not a multiple of 5 OR You do not have enough money. Cannot withdraw.");
        }

    }


}
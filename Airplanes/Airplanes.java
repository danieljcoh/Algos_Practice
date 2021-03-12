public class Airplane
{


    public static void main(String[] args) {
        
        didIProfit(7);
        didIProfit(10);
    }
    
    public static String didIProfit(int customers){
        int buildCost = 2000000;
        int sellCost = 3000000;
        int rent = 1000000;
        int totalCost = 21000000;
        int profit = 0;
        
        String profitStr = "Profit";
        String evenStr = "Broken Even";
        String lossStr = "Loss";
        
        while(customers != 0){
            profit = profit + sellCost;
            customers--;
        }

        System.out.println(profit);
        
        
        
        if(profit > totalCost){
            System.out.println(profitStr);
            return profitStr;
        } else if(profit == totalCost ){
            System.out.println(evenStr);
            return evenStr;
        } else{
            System.out.println(lossStr);
            return lossStr; 
        }
        
    }
    
    
}
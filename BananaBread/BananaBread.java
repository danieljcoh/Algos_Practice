public class BananaBread
{
    //PROBLEM
    //Given a number of fruit, half of the fruit is apples the other half is bananas. 
    public static void main(String[] args) {
    
        makeBananaBread(12);
    }
    
    public static void makeBananaBread(int fruit){
        int bananas = fruit / 2;
        int pies = bananas / 3;
        System.out.println(pies);
    }
    
    
    
}
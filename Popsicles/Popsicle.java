public class Popsicle
{

//PROBLEM
//You have a given number of brothers and sisters and and given number of Popsicles. Only give the popsicles to the siblings if you can dostribute them evenly. Otherwise, eat them yourself 

    public static void main(String[] args) {
        
        calculatePopsicles(11, 20);
    }
    
    
    public static void calculatePopsicles(int pps, int pops){
    
    String mine = "eat them yourself";
    String ours = "give away";
        if(pops % pps == 0){
        
            System.out.println(ours);
        } else{
            System.out.println(mine);
        }
    }
}
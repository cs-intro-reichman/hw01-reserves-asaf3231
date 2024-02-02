// This program generates 3 randon integers in a given range, prints them, and also points the minimal number. 
public class GenThree {

    public static void main(String[] args) {

        int min = Integer.parseInt(args[0]); 
        int max = Integer.parseInt(args[1]); 


        int res1 = (int)((Math.random() * (max-min)+ min)) ; 
        int res2 = (int)((Math.random() * (max-min)+ min)) ;
        int res3 = (int)((Math.random() * (max-min)+ min)) ;

        int min1 = Math.min(res1,res2) ;
        int minF = Math.min(min1,res3) ;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println("The minimal generated number is: " + minF);
        
    }
    
}
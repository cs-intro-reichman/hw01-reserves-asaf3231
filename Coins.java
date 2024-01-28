public class coins {

    public static void main(String[] args) {
        int cents = Integer.parseInt(args[0]);
        
        int divider = cents/25 ; 
        int modulu = cents%25 ; 

        System.out.println("% java Coins " + cents );
        System.out.println("use " + divider + " quarters and " + modulu + " cents");

        
       
    }
}
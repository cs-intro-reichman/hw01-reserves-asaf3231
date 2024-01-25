public class Gen3 {
    public static void main( String[] args){
      int a =  Integer.parseInt(args[0]); 
      int b =  Integer.parseInt(args[1]);
        
      System.out.println("% java Gen3 " + a + " " + b);
      
     double x = ((b-a) * Math.random()+ a);
     double y = ((b-a) * Math.random()+ a);
     double z = ((b-a) * Math.random()+ a);

      System.out.println((int) x);
      System.out.println((int) y);
      System.out.println((int) z);
      
      
      System.out.println("The minimal generated number was " +((int) Math.min(Math.min(x,y),z)));


    }
    
}

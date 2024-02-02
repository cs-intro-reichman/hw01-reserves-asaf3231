// This program determining if 3 lentghs can form a triangle.
public class Triangle {

    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]); //3
        int b = Integer.parseInt(args[1]); //4
        int c = Integer.parseInt(args[2]); //5

        boolean res1 = a+b>c ;
        boolean res2 = a+c>b ;
        boolean res3 = b+c>a ;
        boolean res = res1&&res2&&res3;

        System.out.println( a+", "+ b+", "+c+": " + res );
    }
    
}
    import java.util.*;
 class Butterfly {

     public static void main (String[]args ){
        int n = 8;
        //upper half 
        for (int i = 1 ; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j = 1 ; j <=2*(n-i);j++){
                System.out.print(" ");

            }
           for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
           }
    

 System.out.println();
     }
            //lower half
             for (int i = n ; i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j = 1 ; j <=2*(n-i);j++){
                System.out.print(" ");

            }
           for(int j = 1 ; j<=i ; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        }
       
}
 import java.util.*;
 class Factorial {

    public static void calculateFactorial(int n){
           if( n<0){
            System.out.println("invalid number");
        }
        int factorial = 1;
        for(int i =n ; i>=1; i--){
           factorial = factorial * i ;
         
        }
       
       System.out.println("the factorial is :" + factorial);
            return;
    }
    public static void main(String[] args) {
         System.out.println("which number factorial do you want to find out ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      calculateFactorial(n);
    
    }
}

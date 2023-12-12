import java.util.*;
class Multiplication{
    public static void main(String[] args) {
        System.out.println("OF WHICH NUMBER DO YOU WANT TO FIND THE TABLE ?");
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           
        for (int i=1;i<=10;i++){
          
          System.out.println(i*n);

        }

        
    }
}
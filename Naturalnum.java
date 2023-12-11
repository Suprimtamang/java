import java.util.Scanner;

class Naturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println("enter the naturnal number that you want to sum ");
         int sum = 0;
        for (int i = 1 ; i<=num ; i++){
          
          sum = sum + i;
         
        }
           System.out.println(sum);
    }
       
}

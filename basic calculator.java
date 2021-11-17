import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Select the opertor like +,-,*,/,%");
        char op = sc.next().charAt(0);
        int o =0;

        switch(op){
          case '+' :
          o = num1 + num2 ;
          break; 
          case '-' :
          o = num1 - num2 ;
          break; 
          case '*' :
          o = num1 * num2 ;
          break; 
          case '/' :
          o = num1 / num2 ;
          break; 
          case '%' :
          o = num1 % num2 ;
          break; 
          
          default: 
          System.out.println("Your have written wrong opertor ");

        }

        System.out.println(num1 + " " + op + " " + num2+ " = " + o );





    }
}





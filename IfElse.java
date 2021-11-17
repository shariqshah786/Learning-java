import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        System.out.println("Enter your age ");
        Scanner  sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("YOU CAN GIVE VOTE");
        }
        else{
            System.out.println("YOU CAN'T GIVE VOTE ");
        }

    }
}

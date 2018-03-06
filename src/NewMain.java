import java.util.Scanner;
public class NewMain {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a beginning balance: ");
        double balance = in.nextDouble();
        BankAccount conor = new BankAccount(balance);
        
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Would you like to: "
                    + "\n1)Deposit \n2)Withdraw \n3)Calculate Interest"
                    + "\n4)Quit");
            if(1==1){
                System.out.println("How much would you like to Deposit: ");
                balance += in.nextInt();
            }
            else if(2==2){
                System.out.println("How much would you like to Withdraw: ");
                balance -= in.nextInt();
            }
            else if(3==3){
                System.out.println("What is your interest rate: ");
                double interest = in.nextDouble();
                
            }
            else if(4==4){
                System.out.println("Goodbye!");
                System.exit(0);
            }
            
        }
    }
    
}

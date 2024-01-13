import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        User user1 = new User(0);
        double amount;
        Scanner scanner = new Scanner(System.in);
        String menu = "Welcome to the XYZ Bank!\n1-Deposit\n2-Withdraw\n3-Balance\n4-Exit";

        while(true){
            Utility.print(menu);
            int x = scanner.nextInt();

            switch (x){
                case 1:
                    Utility.print("Please enter deposit amount: ");
                    amount = scanner.nextDouble();
                    user1.depositMoney(amount);
                    Utility.print("Your new balance: "+user1.getMoney());
                    break;
                case 2:
                    Utility.print("Please enter withdraw amount: ");
                    amount = scanner.nextDouble();
                    user1.withdrawMoney(amount);
                    Utility.print("Your new balance: "+user1.getMoney());
                    break;
                case 3:
                    Utility.print("Your new balance: "+user1.getMoney());
                    break;
                case 4:
                    Utility.print("Have a good day!");
                    System.exit(x);
                    scanner.close();
                    break;
            }
        }
    }
}
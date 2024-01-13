public class User {
    private
        double moneyAmount;
    public
        //Getters
        double getMoney(){return this.moneyAmount;}

        //Constructor
        User(double newMoney){
            this.moneyAmount = newMoney;
        }

        //Other Functions
        void withdrawMoney(double moneyAmount){
            if(moneyAmount<=this.moneyAmount) this.moneyAmount -= moneyAmount;
            else Utility.print("Invalid operation!");
        }
        void depositMoney(double moneyAmount){this.moneyAmount += moneyAmount;}


}

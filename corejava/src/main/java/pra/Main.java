package pra;


class BankAccount{

    double balance=6000;
    void withdraw(double amount)throws InSufficientBalanceException{

        if(amount>balance){
            throw new InSufficientBalanceException("Insufficient exception");
        }
        balance=balance-amount;

        System.out.println("Withdraw successfull");
        System.out.println("Remaining balance:" +balance);
    }
}
public class Main{
    public static void main(String[] args){

        BankAccount bank=new BankAccount();

        try{
            bank.withdraw(1290);
        } catch (InSufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}


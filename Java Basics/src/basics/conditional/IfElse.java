package basics.conditional;

class Account{
    double balance = 600;
    double amount = 1500;

    public void checkAmount()
    {
        if(amount < 0 || amount>balance)
        {
            System.out.println("Withdrawal has failed");
        }else{
            balance-=amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}
public class IfElse {
    static void main(String[] args) {
        Account obj = new Account();
        obj.checkAmount();

//        if(01) //Wrong-Compilation Error since if only required true/false values.
//        {
//
//        }
    }
}

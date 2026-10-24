package basics.constructor;


class Account{
    private long accId;
    protected Account(){
        System.out.println("Inside Account");
    }
    // A constructor can be private, protected
    protected Account(long accId){
        this.accId = accId;
    }
}
public class ConstructorDemo{
    static void main(String[] args) {
        Account account = new Account(12);
    }
}

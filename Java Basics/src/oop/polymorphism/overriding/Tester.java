package oop.polymorphism.overriding;

class User{
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;

    User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount){

        if(this.walletBalance >= billAmount){
            this.walletBalance -= billAmount;
        }else{
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}

class PremiumUser  extends User{
    private int rewardPoints;
    PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public boolean makePayment(double billAmount){
        if(billAmount > getWalletBalance()){
            return false;
        }
        setWalletBalance(getWalletBalance() - billAmount);
        setRewardPoints((int) (getRewardPoints() + (billAmount * 0.10)));
        return true;
    }
}
public class Tester {
    public static void main(String[] args) {
        User user = new User(101,"Devesh","dev@gmail.com",100);

        PremiumUser pUser = new PremiumUser(201,"Jill","jill@gmail.com",300);

        if(user.makePayment(70)){
            System.out.println("Success");
        }
        if(pUser.makePayment(150)){
            System.out.println("Success");
        }

        System.out.println(user.getWalletBalance());
        System.out.println(pUser.getWalletBalance());
        System.out.println(pUser.getRewardPoints());
    }
}

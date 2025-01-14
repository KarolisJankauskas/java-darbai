public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterest) {
        this.balance = initialBalance;
        this.interestRate = initialInterest;
    }

    public void printBalance() {
        System.out.println(this.balance);

    }
    public void waitOneYear() {
        this.balance *= this.interestRate;
    }

}

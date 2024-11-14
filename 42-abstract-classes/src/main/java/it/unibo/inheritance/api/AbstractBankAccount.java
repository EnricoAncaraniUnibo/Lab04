package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount{

    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;
    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount(AccountHolder a, double b) {
        this.balance = b;
        this.holder = a;
        this.transactions = 0;
    }

    protected void setBalance(final double balance) {
        this.balance = balance;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }
    
    public void chargeManagementFees(int id) {
        final double feeAmount = computeFee();
        if (checkUser(id) && isWithDrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }

    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    public void depositFromATM(int id, double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public AccountHolder getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionsCount() {
        return transactions;
    }

    public void withdraw(int id, double amount) {
        if (isWithDrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void withdrawFromATM(int id, double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

   protected abstract boolean isWithDrawAllowed(double amount); 
    
    protected abstract double computeFee();
}

package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount{

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }

    private boolean isWithdrawAllowed(final double amount) {
        return super.getBalance() >= amount;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            super.setBalance(super.getBalance()+amount);
            this.incrementTransactions();
        }
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + this.ATM_TRANSACTION_FEE);
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + super.getTransactionsCount() * this.TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            this.setBalance(this.getBalance()-feeAmount);
            this.resetTransactions();
        }
    }
}

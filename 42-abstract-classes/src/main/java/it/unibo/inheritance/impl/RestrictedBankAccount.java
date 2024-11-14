package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount{

    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(AccountHolder a, double b) {
        super(a, b);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() > amount;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE+TRANSACTION_FEE*this.getTransactionsCount();
    }
    
}

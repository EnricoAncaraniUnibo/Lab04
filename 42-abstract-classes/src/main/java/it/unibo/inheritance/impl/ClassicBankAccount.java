package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount{

    public ClassicBankAccount(AccountHolder a, double b) {
        super(a, b);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return true;
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE;
    }
    
}

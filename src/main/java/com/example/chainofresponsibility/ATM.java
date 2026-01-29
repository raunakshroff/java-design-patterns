package com.example.chainofresponsibility;

public abstract class ATM {

    public ATM nextATM;

    public ATM(ATM nextAtm) {
        this.nextATM = nextAtm;
    }

    public abstract void dispense(WithdrawalRequest request);

}

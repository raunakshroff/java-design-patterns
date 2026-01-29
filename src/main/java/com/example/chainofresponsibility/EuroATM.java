package com.example.chainofresponsibility;

public class EuroATM extends ATM {

    public EuroATM(ATM nextAtm) {
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing EUR €" + request.getAmount());
        } else if(nextATM != null) {
            nextATM.dispense(request);
        }
    }
}

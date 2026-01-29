package com.example.chainofresponsibility;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildATMsChain();
        atm.dispense(request);
    }

    public static ATM buildATMsChain() {
        ATM usdAtm = new UsDollarATM(null);
        ATM euroAtm = new EuroATM(usdAtm);
        return euroAtm;
    }

}

package oop.practice;

/**
 * Created by Roman on 21.09.2016.
 */
public class AccountsReceivable {

    private CustomerTransaction transactionObject;
    // Without using interface

    // constructor
    public AccountsReceivable(CustomerTransaction aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        // code that sends the invoice
    }
}

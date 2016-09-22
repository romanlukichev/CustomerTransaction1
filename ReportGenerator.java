package oop.practice;

/**
 * Created by Roman on 21.09.2016.
 */
public class ReportGenerator {

    private CustomerTransaction transactionObject;

    public void generateReport(){
        System.out.println(
                transactionObject.getName()+" "+ transactionObject.productBreakdown()+" "+transactionObject.getDate()
        );
    }
}

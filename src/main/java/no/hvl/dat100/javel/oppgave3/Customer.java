package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;


    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    // TODO - getter/setter methods for all objectvariables
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getCustomer_id(){
        return this.customer_id;
    }
    public PowerAgreementType getAgreement(){
        return this.agreement;
    }

    // TODO - toString method
    @Override
    public String toString(){
        return this.customer_id + " " + this.name + " " + this.email + " " + this.agreement;
    }

}

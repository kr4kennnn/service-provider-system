package project101;

public class ExistingCustomer extends Customer {

    private Subscription subscription;

    public ExistingCustomer(String citizenshipNr) {
        super(citizenshipNr);
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

}

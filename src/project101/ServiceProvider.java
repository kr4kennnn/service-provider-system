package project101;

public interface ServiceProvider {

    public void addSubscriptionPlan(SubscriptionPlan s);

    public SubscriptionPlan findSubscriptionPlan(String plan);

    public String getName();

    public void setName(String name);
}

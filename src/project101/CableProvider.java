package project101;

public class CableProvider implements ServiceProvider {

    private String name;
    private SubscriptionPlan[] subscriptionPlans;
    private static final int MAX_PLANS = 50;
    private int count = 0;

    public CableProvider(String name) {
        this.name = name;
        subscriptionPlans = new SubscriptionPlan[MAX_PLANS];
    }

    //adding plans to the array
    @Override
    public void addSubscriptionPlan(SubscriptionPlan s) {
        subscriptionPlans[count] = s;
        count++;
    }

    //cycling thourgh the array and returning SubscriptionPlan object if there is any
    @Override
    public SubscriptionPlan findSubscriptionPlan(String plan) {
        for (int i = 0; i < count; i++) {
            if (subscriptionPlans[i].getName().equalsIgnoreCase(plan)) {
                System.out.println("Subscription plan found.");
                return subscriptionPlans[i];
            }
        }
        System.out.println("Subscription plan does not exist. Subscription failed.");
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

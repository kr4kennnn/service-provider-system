package project101;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GSMProviderTest {

    public GSMProviderTest() {
    }

    private SubscriptionPlan plan1, plan2, plan3;
    private GSMProvider provider;

    @Before
    public void setUp() {
        provider = new GSMProvider("Vodafone");
        plan1 = new SubscriptionPlan("2GB", provider);
        plan2 = new SubscriptionPlan("3GB", provider);
        plan3 = new SubscriptionPlan("6GB", provider);
    }

    @Test
    public void testAddSubscriptionPlan() {
        System.out.println("Testing addSubscriptionPlan");
        SubscriptionPlan expecteds[] = new SubscriptionPlan[50];
        provider.addSubscriptionPlan(plan1);
        provider.addSubscriptionPlan(plan2);
        provider.addSubscriptionPlan(plan3);
        expecteds[0] = plan1;
        expecteds[1] = plan2;
        expecteds[2] = plan3;
        SubscriptionPlan actuals[] = provider.getSubscriptionPlans();
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFindSubscriptionPlan() {
        System.out.println("Testing findSubscriptionPlan");
        provider.addSubscriptionPlan(plan1);
        provider.addSubscriptionPlan(plan2);
        provider.addSubscriptionPlan(plan3);
        String plan = "6GB";
        SubscriptionPlan expResult = plan3;
        SubscriptionPlan result = provider.findSubscriptionPlan(plan);
        assertEquals(expResult, result);
    }

}

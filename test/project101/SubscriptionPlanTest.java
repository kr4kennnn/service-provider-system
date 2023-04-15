package project101;

import org.junit.Test;
import org.junit.BeforeClass;
import static junit.framework.TestCase.*;

public class SubscriptionPlanTest {

    public SubscriptionPlanTest() {
    }

    private static SubscriptionPlan plan;
    private static GSMProvider provider, newProvider;

    @BeforeClass
    public static void setUp() {
        provider = new GSMProvider("Vodafone");
        newProvider = new GSMProvider("Turkcell");
        plan = new SubscriptionPlan("5GB", provider);
    }

    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "5GB";
        String result = plan.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("Testing setName");
        String name = "10GB";
        plan.setName(name);
        assertEquals("10GB", plan.getName());
    }

    @Test
    public void testGetServiceProvider() {
        System.out.println("Testing getServiceProvider");
        ServiceProvider expResult = provider;
        ServiceProvider result = plan.getServiceProvider();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetServiceProvider() {
        System.out.println("Testing setServiceProvider");
        ServiceProvider serviceProvider = newProvider;
        plan.setServiceProvider(serviceProvider);
        assertEquals(newProvider, plan.getServiceProvider());
    }

    @Test
    public void testToString() {
        System.out.println("Testing toString");
        String expResult = "SUBSCRIPTION PLAN NAME: " + "5GB" + "\nSERVICE PROVIDER: " + "Vodafone";
        String result = plan.toString();
        assertEquals(expResult, result);
    }
}

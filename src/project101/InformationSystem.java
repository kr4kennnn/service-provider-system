package project101;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InformationSystem {

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.print("GSM Service Provider Name: ");
        //input gsm provider name and create object using a constructor
        GSMProvider gsm = new GSMProvider(input.nextLine());

        System.out.print("Number of subscription plans? ");
        Integer planCount = input.nextInt();
        //input plan count and create an array of plans
        SubscriptionPlan[] plans = new SubscriptionPlan[planCount];
        input.nextLine();

        //cycle through the array and create an object using a constructor
        for (int i = 0; i < planCount; i++) {
            System.out.print("What is the name of plan #" + (i + 1) + "? ");
            plans[i] = new SubscriptionPlan(input.nextLine(), gsm);
            //adding inputted plan names to the original SubscriptionPlan array
            gsm.addSubscriptionPlan(plans[i]);
        }

        //after getting the input, creating a customer with a constructor
        System.out.println("What is your citizenship number? ");
        ExistingCustomer c1 = new ExistingCustomer(input.nextLine());
        //setting name
        System.out.println("What is your name? ");
        c1.setName(input.nextLine());

        //input date
        System.out.println("Start date for the subscription? (DD/MM/YYYY)");
        String sDate1 = input.nextLine();
        //using simple date format and parsing to convert input to Date format
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        //asking customer the name of plan
        System.out.println("Name of the plan you want to subscribe? ");

        //creating a new Subscription using a constructor
        //findsubscription method returns the SubscriptionPlan object into the constructor
        Subscription sub1 = new Subscription(date1, gsm.findSubscriptionPlan(input.nextLine()));
        //confirming subscription of the customer
        c1.setSubscription(sub1);

        //Output
        System.out.println(c1);
        System.out.println(sub1);
    }

}

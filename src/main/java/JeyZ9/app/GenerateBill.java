package JeyZ9.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();

        System.out.print("Enter the number of units for bill calculation: ");
        int units = 0;
        try {
            units = Integer.parseInt(br.readLine());
        }catch (NumberFormatException ex){
            System.out.println("Invalid input for units. Please enter a valid integer");
            return;
        }

        Plan p = planFactory.getPlan(planName);
        if(p == null) {
            System.out.println("Invalid plan name entered. Please enter a valid plan.");
        }

        System.out.print("Bill amount for " + planName + " of " + units + " units is : ");
        if (p != null) {
            p.getRate();
            p.calculateBill(units);
        }

    }
}

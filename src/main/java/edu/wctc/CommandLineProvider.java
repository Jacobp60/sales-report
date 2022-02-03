package edu.wctc;

import edu.wctc.Iface.SalesInput;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CommandLineProvider implements SalesInput {
    @Override
    public List<Sale> getSales() {

        List<Sale> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        String response = "y";

        while(response.equalsIgnoreCase("y")) {
            System.out.println("Enter Customer name");
            String name = keyboard.nextLine();

            System.out.println("Enter country of sale: ");
            String country = keyboard.nextLine();

            System.out.println("Enter Amount of Sale: ");
            double amount = keyboard.nextDouble();

            System.out.println("Enter the amount of Tax for sale: ");
            double tax = keyboard.nextDouble();

            Sale sale = new Sale();
            sale.setCustomerName(name);
            sale.setCountry(country);
            sale.setTax(tax);
            sale.setAmount(amount);
            list.add(sale);

            System.out.println("More Sales? (y/n)");
            String fi = keyboard.nextLine();
            response = fi;


        }
        return list;
    }
}

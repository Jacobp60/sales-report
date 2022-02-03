package edu.wctc;

import edu.wctc.Iface.SalesInput;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<Sale> list = new ArrayList<>();
        File file = new File("sales.txt");
        try {
            Scanner reader = new Scanner(file);

            while(reader.hasNext()) {
                String line = reader.nextLine();
                String[] contents = line.split(",");
                Sale sale = new Sale();
                sale.setCustomerName(contents[0]);
                sale.setCountry(contents[1]);
                sale.setAmount(Double.parseDouble(contents[2]));
                sale.setTax(Double.parseDouble(contents[3]));
                sale.setShippingFee(0.0);

                list.add(sale);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}

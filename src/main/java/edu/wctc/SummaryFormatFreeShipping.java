package edu.wctc;

import edu.wctc.Iface.SaleFormatter;
import org.springframework.stereotype.Component;

import java.util.List;

public class SummaryFormatFreeShipping implements SaleFormatter {
    @Override
    public String format(List<Sale> list) {
        StringBuilder sb = new StringBuilder();
        for(Sale sale: list){
            sb.append(sale.getCustomerName());
            sb.append(", ");
            sb.append(sale.getCountry());
            sb.append(", ");
            sb.append(sale.getAmount());
            sb.append(", ");
            sb.append(sale.getTax());
            sb.append(", ");
            sb.append(sale.getShippingFee());
            sb.append("\n");

        }

        return sb.toString();
    }
}

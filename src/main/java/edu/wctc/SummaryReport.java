package edu.wctc;

import edu.wctc.Iface.SaleFormatter;
import edu.wctc.Iface.SalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SummaryReport implements SalesReport {
    @Autowired
    private SaleFormatter saleFormatter;
    @Override
    public void generateReport(List<Sale> salesList) {
        String fi = saleFormatter.format(salesList);
        System.out.println("General Sale Summary");
        System.out.println("_______________________________________");
        System.out.println(fi);
    }
}

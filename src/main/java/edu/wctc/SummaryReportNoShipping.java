package edu.wctc;


import edu.wctc.Iface.SaleFormatter;
import edu.wctc.Iface.SalesInput;
import edu.wctc.Iface.SalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SummaryReportNoShipping implements SalesReport {
    @Autowired
    private SaleFormatter saleFormatter;

    @Override
    public void generateReport(List<Sale> saleList) {

        String fi = saleFormatter.format(saleList);
        System.out.println("General Sale Summary (NO SHIPPING FEE)");
        System.out.println("_______________________________________");
        System.out.println(fi);

    }

}


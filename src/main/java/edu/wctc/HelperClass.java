package edu.wctc;

import edu.wctc.Iface.SalesInput;
import edu.wctc.Iface.SalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelperClass {
    @Autowired
    private SalesReport salesReport;
    @Autowired
    private SalesInput salesInput;
    public void process(){
        List<Sale> list;
        list = salesInput.getSales();
        salesReport.generateReport(list);
    }

}

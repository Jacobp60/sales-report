package edu.wctc.Iface;

import edu.wctc.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}

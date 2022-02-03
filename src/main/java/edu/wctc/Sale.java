package edu.wctc;

import lombok.Data;

@Data
public class Sale {
    private String customerName;
    private String country;
    private double amount;
    private double tax;
    private double shippingFee;
}

package edu.wctc.Iface;

import edu.wctc.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}

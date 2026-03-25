package com.manjula.tireservicebooking.booking;
import com.manjula.tireservicebooking.service.Service;

public class Booking {

    private final String customerName;
    private final Service service;
    private final double finalPrice;

    public Booking(String customerName, Service service, double finalPrice) {
        this.customerName = customerName;
        this.service = service;
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "Booking[customer=%s, service=%s, price=%.2f]",
                customerName,
                service.getName(),
                finalPrice
        );
    }
}

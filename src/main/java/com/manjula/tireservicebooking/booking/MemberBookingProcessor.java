package com.manjula.tireservicebooking.booking;
import com.manjula.tireservicebooking.service.Service;

public class MemberBookingProcessor implements BookingProcessor {

    private static final double DISCOUNT = 0.15;

    @Override
    public Booking process(BookingRequest request) {

        double basePrice = request.getService().calculatePrice();
        double finalPrice = basePrice * (1 - DISCOUNT);

        // Business rule: priority access
        System.out.println("[Member] Priority slot allocated");

        return new Booking(
                request.getCustomerName(),
                request.getService(),
                finalPrice
        );
    }
}

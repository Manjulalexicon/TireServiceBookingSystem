package com.manjula.tireservicebooking.booking;

import com.manjula.tireservicebooking.service.Service;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking process(BookingRequest request) {

        double finalPrice = request.getService().calculatePrice();

        return new Booking(
                request.getCustomerName(),
                request.getService(),
                finalPrice
        );
    }
}

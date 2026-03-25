package com.manjula.tireservicebooking;
import com.manjula.tireservicebooking.service.Service;
import com.manjula.tireservicebooking.service.WinterTireChange;
import com.manjula.tireservicebooking.service.SummerTireChange;

import com.manjula.tireservicebooking.booking.BookingRequest;
import com.manjula.tireservicebooking.booking.Booking;
import com.manjula.tireservicebooking.booking.BookingProcessor;
import com.manjula.tireservicebooking.booking.MemberBookingProcessor;
import com.manjula.tireservicebooking.booking.NonMemberBookingProcessor;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 🔹 Polymorphism
        List<Service> services = List.of(
                new WinterTireChange(1, 100),
                new SummerTireChange(2, 80)
        );

        services.forEach(service ->
                System.out.println(
                        service.getName() + " -> " + service.calculatePrice()
                )
        );

        System.out.println("\n--- Booking Flow ---");

        BookingRequest request = new BookingRequest(
                new WinterTireChange(3, 120),
                "Manjula",
                true
        );

        // 🔹 Strategy selection (runtime switch)
        BookingProcessor processor = request.isMember()
                ? new MemberBookingProcessor()
                : new NonMemberBookingProcessor();

        Booking booking = processor.process(request);

        System.out.println(booking);
    }
}
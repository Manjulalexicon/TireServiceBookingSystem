package com.manjula.tireservicebooking.booking;

import com.manjula.tireservicebooking.service.Service;

public class BookingRequest {

    private final Service service;
    private final String customerName;
    private final boolean member;

    public BookingRequest(Service service, String customerName, boolean member) {
        this.service = service;
        this.customerName = customerName;
        this.member = member;
    }

    public Service getService() {
        return service;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean isMember() {
        return member;
    }
}

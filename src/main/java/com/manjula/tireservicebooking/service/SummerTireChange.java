package com.manjula.tireservicebooking.service;

public class SummerTireChange extends Service {

    private static final double DISCOUNT_RATE = 0.10;

    public SummerTireChange(int id, double basePrice) {
        super(id, "Summer Tire Change", basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 - DISCOUNT_RATE);
    }

    @Override
    public int getDurationMinutes() {
        return 45;
    }
}

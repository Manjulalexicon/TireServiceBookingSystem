package com.manjula.tireservicebooking.service;

public class WinterTireChange extends Service {

    private static final double STORAGE_FEE = 30.0;

    public WinterTireChange(int id, double basePrice) {
        super(id, "Winter Tire Change", basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + STORAGE_FEE;
    }

    @Override
    public int getDurationMinutes() {
        return 60;
    }
}

package com.manjula.tireservicebooking.service;

public abstract class Service {

    private final int id;
    private final String name;
    private final double basePrice;

    protected Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected double getBasePrice() {
        return basePrice;
    }

    // Core polymorphic behavior
    public abstract double calculatePrice();

    public abstract int getDurationMinutes();
}

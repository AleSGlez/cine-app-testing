package com.cineapp;

public class TicketPriceService {

    private static final double BASE_PRICE = 80.0;
    private static final double EXTRA_3D = 30.0;
    private static final double WEDNESDAY_DISCOUNT = 0.20;

    public double calculatePrice(boolean is3D, boolean isWednesday, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }

        double pricePerTicket = BASE_PRICE;

        if (is3D) pricePerTicket += EXTRA_3D;
        if (isWednesday) pricePerTicket *= (1 - WEDNESDAY_DISCOUNT);

        return pricePerTicket * quantity;
    }
}

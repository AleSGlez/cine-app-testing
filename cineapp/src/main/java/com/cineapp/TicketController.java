package com.cineapp;

public class TicketController {

    private TicketPriceService service = new TicketPriceService();

    public double getPrice(boolean is3D, boolean isWednesday, int qty) {
        return service.calculatePrice(is3D, isWednesday, qty);
    }
}

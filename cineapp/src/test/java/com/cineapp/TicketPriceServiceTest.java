package com.cineapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketPriceServiceTest {

    @Test
    void precioNormal() {
        TicketPriceService s = new TicketPriceService();
        assertEquals(80.0, s.calculatePrice(false, false, 1));
    }

    @Test
    void precio3D() {
        TicketPriceService s = new TicketPriceService();
        assertEquals(110.0, s.calculatePrice(true, false, 1));
    }

    @Test
    void precioMiercoles() {
        TicketPriceService s = new TicketPriceService();
        assertEquals(64.0, s.calculatePrice(false, true, 1));
    }

    @Test
    void cantidadInvalida() {
        TicketPriceService s = new TicketPriceService();
        assertThrows(IllegalArgumentException.class,
            () -> s.calculatePrice(false, false, 0));
    }
}

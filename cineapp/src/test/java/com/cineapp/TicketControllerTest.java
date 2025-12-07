package com.cineapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketControllerTest {

    @Test
    void pruebaIntegracionPrecio() {
        TicketController c = new TicketController();
        assertEquals(160.0, c.getPrice(false, false, 2));
    }
}

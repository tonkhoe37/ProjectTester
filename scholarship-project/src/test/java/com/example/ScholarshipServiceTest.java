package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScholarshipServiceTest {

    @Test
    void testBoundaryCases() {
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 15, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(0.0, 15, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(0.1, 15, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.9, 15, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(4.0, 15, 2));

        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 0, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 1, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 29, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 30, 2));

        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 15, 0));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 15, 1));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 15, 4));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.0, 15, 5));
    }

    @Test
    void testDecisionTable() {
        assertEquals("Hoc bong toan phan", ScholarshipService.evaluate(3.8, 20, 0));

        assertEquals("Input khong hop le", ScholarshipService.evaluate(4.5, 20, 0));
        assertEquals("Input khong hop le", ScholarshipService.evaluate(-1.0, 20, 0));
        assertEquals("Input khong hop le", ScholarshipService.evaluate(3.8, 35, 2));
        assertEquals("Input khong hop le", ScholarshipService.evaluate(2.5, -5, 3));
        assertEquals("Input khong hop le", ScholarshipService.evaluate(3.8, 10, 6));
        assertEquals("Input khong hop le", ScholarshipService.evaluate(3.8, 20, -1));

        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.8, 10, 2));
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.8, 20, 3));
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScholarshipControlFlowTest {

    @Test
    void testControlFlowCoverageC2() {
        // TC1.1: (3.2, 16, 2) -> Không có học bổng
        assertEquals("Khong co hoc bong", ScholarshipService.evaluate(3.2, 16, 2));

        // TC1.2: (3.8, 21, 0) -> Học bổng toàn phần
        assertEquals("Hoc bong toan phan", ScholarshipService.evaluate(3.8, 21, 0));

        // TC1.3: (4.5, 14, 6) -> Input không hợp lệ
        assertEquals("Input khong hop le", ScholarshipService.evaluate(4.5, 14, 6));
    }
}
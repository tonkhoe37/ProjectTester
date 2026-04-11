package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScholarshipDataFlowTest {

    @Test
    void testAllUsesCoverage() {

        // ===== Nhóm 1: score KHÔNG redefine (def tại (3)) =====

        // TC1: score >= 3.5 → full scholarship
        assertEquals("Hoc bong toan phan",
                ScholarshipService.evaluate(4.0, 20, 0));

        // TC2: 3.0 <= score < 3.5 → partial scholarship
        assertEquals("Hoc bong mot phan",
                ScholarshipService.evaluate(3.2, 15, 0));


        // ===== Nhóm 2: score CÓ redefine (def tại (5)) =====

        // TC3: redefine nhưng vẫn >= 3.5
        assertEquals("Hoc bong toan phan",
                ScholarshipService.evaluate(4.0, 20, 1));

        // TC4: redefine → vào nhánh partial
        assertEquals("Hoc bong mot phan",
                ScholarshipService.evaluate(3.2, 15, 1));

        // TC5: redefine → < 3.0 → no scholarship
        assertEquals("Khong co hoc bong",
                ScholarshipService.evaluate(2.8, 10, 2));


        // ===== Nhóm 3: invalid input =====

        // TC6: GPA invalid
        assertEquals("Input khong hop le",
                ScholarshipService.evaluate(5.0, 10, 0));

        // TC7: credits invalid
        assertEquals("Input khong hop le",
                ScholarshipService.evaluate(3.0, 40, 0));
    }
}

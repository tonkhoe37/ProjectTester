package com.example;
public class ScholarshipService {

    public static String evaluate(double gpa, int credits, int violations) {

        // 1. Validate input
        if (gpa < 0 || gpa > 4.0 ||
                credits < 0 || credits > 30 ||
                violations < 0 || violations > 5) {
            return "Input khong hop le";
        }

        // 2. Full scholarship
        if (gpa >= 3.6 && credits >= 15 && violations == 0) {
            return "Hoc bong toan phan";
        }

        // 3. Default
        return "Khong co hoc bong";
    }
}
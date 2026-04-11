package com.example;
public class ScholarshipService {

    public static String evaluate(double gpa, int credits, int violations) {

        if (gpa < 0 || gpa > 4.0 ||
            credits < 0 || credits > 30 ||
            violations < 0 || violations > 5) {

            return "Input khong hop le";      
        }

     
        double score = gpa * 0.7 + credits * 0.1;
        if (violations > 0) {

            score = score - violations * 0.2; 
        }

        if (score >= 3.5) {

            return "Hoc bong toan phan";    

        }

        if (score >= 3.0) {

            return "Hoc bong mot phan";    
        }

        return "Khong co hoc bong";           
    }
}
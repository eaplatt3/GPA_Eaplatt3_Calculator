package com.example.sickl.gpa_eaplatt3_calculator;

public class Compute {

    //Declared Variable for the Method
    public double gpa;

    //Constructor
    public Compute() {

    }

    //Method for Computing the GPA Based on Values Passed
    public double getGpa(double v, double w, double x, double y, double z) {

        double tot = v + w + x + y + z;

        gpa = tot / 5;

        return tot;
    }
}


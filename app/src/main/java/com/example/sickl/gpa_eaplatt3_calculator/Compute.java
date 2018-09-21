package com.example.sickl.gpa_eaplatt3_calculator;

public class Compute {


    public double gpa;

    public Compute() {

    }


    public double getGpa(double v, double w, double x, double y, double z) {

        gpa = (v + w + x + y + z)/5;

        return gpa;
    }




}

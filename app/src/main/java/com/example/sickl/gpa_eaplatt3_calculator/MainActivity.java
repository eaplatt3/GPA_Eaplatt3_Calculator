//Earl Platt III
//BCS421 - Android
//App That Calculates GPA
/////////////////////////////////
//Input: User Enters Test Scores
//Output: Displays GPA & Changes Background Color
//        Based on GPA

package com.example.sickl.gpa_eaplatt3_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv;
    EditText edtxt1;
    EditText edtxt2;
    EditText edtxt3;
    EditText edtxt4;
    EditText edtxt5;
    Button btn;
    android.support.constraint.ConstraintLayout layout;

    Compute comp = new Compute();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declares the XML Containers
        txtv = (TextView) findViewById(R.id.txt_view);
        edtxt1 = (EditText) findViewById(R.id.edt1);
        edtxt2 = (EditText) findViewById(R.id.edt2);
        edtxt3 = (EditText) findViewById(R.id.edt3);
        edtxt4 = (EditText) findViewById(R.id.edt4);
        edtxt5 = (EditText) findViewById(R.id.edt5);
        btn = (Button) findViewById(R.id.btn);
        layout = (android.support.constraint.ConstraintLayout) findViewById(R.id.background);

    }

    //Method of Reading in the Numbers
    public void read_number(View view)  {

        //Grabs the Imputed Text
        String first = edtxt1.getText().toString().trim();

        String second = edtxt2.getText().toString().trim();

        String third = edtxt3.getText().toString().trim();

        String fourth = edtxt4.getText().toString().trim();

        String fifth = edtxt5.getText().toString().trim();

        //Coverts Imputed Text to Doubles
        double f = Double.parseDouble(first);
        double s = Double.parseDouble(second);
        double t = Double.parseDouble(third);
        double foth = Double.parseDouble(fourth);
        double fif = Double.parseDouble(fifth);

        //Passes the Converted Doubles to the Method
        comp.getGpa(f, s, t, foth, fif);

        //Displays Return from the Method
        txtv.setText(Double.toString(comp.gpa) + " GPA");

        //Checks the GPA Return for the Method and Changes
        //the Background Accordingly
        if(comp.gpa >= 80){

            layout.setBackgroundColor(Color.GREEN);
        }

        if(comp.gpa >= 61 || comp.gpa <= 79){

            layout.setBackgroundColor(Color.YELLOW);
        }

        if(comp.gpa <= 60){

            layout.setBackgroundColor(Color.RED);
        }


    }

}

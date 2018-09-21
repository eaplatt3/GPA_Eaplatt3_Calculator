package com.example.sickl.gpa_eaplatt3_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv;
    EditText edtxt1;
    EditText edtxt2;
    EditText edtxt3;
    EditText edtxt4;
    EditText edtxt5;

    Compute comp = new Compute();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv = findViewById(R.id.txt_view);
        edtxt1 = findViewById(R.id.edt1);
        edtxt2 = findViewById(R.id.edt2);
        edtxt3 = findViewById(R.id.edt3);
        edtxt4 = findViewById(R.id.edt4);
        edtxt5 = findViewById(R.id.edt5);

    }

   // comp.setScore();
    public void read_number(View view){
        comp.getGpa(Double.parseDouble(edtxt1.getText().toString().trim()),Double.parseDouble(edtxt2.getText().toString().trim()),Double.parseDouble(edtxt3.getText().toString().trim()),Double.parseDouble(edtxt4.getText().toString().trim()), Double.parseDouble(edtxt5.getText().toString().trim()));
                txtv.setText((int)comp.gpa);



    }
}

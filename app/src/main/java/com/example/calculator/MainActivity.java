package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText hitungPanjang, hitungLebar;
    private Button buttonCalculate;
    private TextView tampil_hasil;
    private String panjang, lebar;
    private double p, l, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitungPanjang = (EditText) findViewById(R.id.inputPanjang);
        hitungLebar = (EditText) findViewById(R.id.inputLebar);
        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
        tampil_hasil = (TextView) findViewById(R.id.viewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = hitungPanjang.getText().toString();
                lebar = hitungLebar.getText().toString();

                p = Double.parseDouble(panjang);
                l = Double.parseDouble(lebar);

                luas = p * l;

                tampil_hasil.setText("Luas: : "+luas);
            }
        });

    }
}

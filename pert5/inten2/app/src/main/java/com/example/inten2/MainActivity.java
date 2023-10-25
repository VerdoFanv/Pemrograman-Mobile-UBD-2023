package com.example.inten2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button bnSubmit;
    EditText edKodeMhs, edNamaMhs;
    Spinner spFakultas, spProdi;
    RadioGroup jenisKelamin;
    `
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnSubmit = findViewById(R.id.btnSubmit);
        edKodeMhs = findViewById(R.id.kodeMahasiswa);
        edNamaMhs = findViewById(R.id.namaMahasiswa);
        jenisKelamin = findViewById(R.id.jk);
        spFakultas = findViewById(R.id.spinner1);
        spProdi = findViewById(R.id.spinner2);

        bnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int SelectedId = jenisKelamin.getCheckedRadioButtonId();
                RadioButton selectedGender = (RadioButton) findViewById(SelectedId);

                Intent intent = new Intent(getApplicationContext(), HalamanKedua.class);
                intent.putExtra("data1", edKodeMhs.getText().toString());
                intent.putExtra("data2", edNamaMhs.getText().toString());
                intent.putExtra("data3", selectedGender.getText().toString());
                intent.putExtra("data4", spFakultas.getSelectedItem().toString());
                intent.putExtra("data5", spProdi.getSelectedItem().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
package com.example.loginbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormMahasiswa extends AppCompatActivity {
    Button btnSimpan;
    EditText edKode, edNama;
    Spinner spFakultas, spProdi;
    RadioGroup rgJk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_mahasiswa);

        // init to property
        btnSimpan = (Button) findViewById(R.id.btnsave);
        edKode = (EditText) findViewById(R.id.kodemhs);
        edNama = (EditText) findViewById(R.id.namamhs);
        spFakultas = (Spinner) findViewById(R.id.fakultas);
        spProdi = (Spinner) findViewById(R.id.prodi);
        rgJk = (RadioGroup) findViewById(R.id.jk);

        // adding listener
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputKode = String.valueOf(edKode.getText().toString());
                String inputNama = String.valueOf(edNama.getText().toString());

                int gender = rgJk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputJk = String.valueOf(jk.getText().toString());

                int SelectedId = rgJk.getCheckedRadioButtonId();
                RadioButton selectedGender = (RadioButton) findViewById(SelectedId);

                Intent intent = new Intent(getApplicationContext(), FormHasil.class);
                intent.putExtra("data1", edKode.getText().toString());
                intent.putExtra("data2", edNama.getText().toString());
                intent.putExtra("data3", selectedGender.getText().toString());
                intent.putExtra("data4", spFakultas.getSelectedItem().toString());
                intent.putExtra("data5", spProdi.getSelectedItem().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
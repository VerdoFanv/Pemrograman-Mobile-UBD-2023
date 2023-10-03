package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSimpan;
    EditText nama, nik, usia, alamat, institusi;
    TextView viewNama, viewNik, viewUsia, viewAlamat, viewInstitusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpan = (Button) findViewById(R.id.btnSave);

        nama = (EditText) findViewById(R.id.nama);
        nik = (EditText) findViewById(R.id.nik);
        usia = (EditText) findViewById(R.id.usia);
        alamat = (EditText) findViewById(R.id.alamat);
        institusi = (EditText) findViewById(R.id.institusi);

        viewNama = (TextView) findViewById(R.id.resultNama);
        viewNik = (TextView) findViewById(R.id.resultNIK);
        viewUsia = (TextView) findViewById(R.id.resultUsia);
        viewAlamat = (TextView) findViewById(R.id.resultAlamat);
        viewInstitusi = (TextView) findViewById(R.id.resultInstitusi);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewNama.setText(String.valueOf(nama.getText().toString()));
                viewNik.setText(String.valueOf(nik.getText().toString()));
                viewUsia.setText(String.valueOf(usia.getText().toString()));
                viewAlamat.setText(String.valueOf(alamat.getText().toString()));
                viewInstitusi.setText(String.valueOf(institusi.getText().toString()));
            }
        });
    }
}
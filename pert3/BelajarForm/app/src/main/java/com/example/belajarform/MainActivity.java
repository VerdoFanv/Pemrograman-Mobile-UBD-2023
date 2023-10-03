package com.example.belajarform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSimpan, btnClear;
    EditText edKode, edNama;
    Spinner spFakultas, spProdi;
    RadioGroup rgJk;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init to property
        btnSimpan = (Button) findViewById(R.id.btnsave);
        btnClear = (Button) findViewById(R.id.btnclear);
        edKode = (EditText) findViewById(R.id.kodemhs);
        edNama = (EditText) findViewById(R.id.namamhs);
        spFakultas = (Spinner) findViewById(R.id.fakultas);
        spProdi = (Spinner) findViewById(R.id.prodi);
        rgJk = (RadioGroup) findViewById(R.id.jk);
        tvHasil = (TextView) findViewById(R.id.hasil);

        // adding listener
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputKode = String.valueOf(edKode.getText().toString());
                String inputNama = String.valueOf(edNama.getText().toString());

                int gender = rgJk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputJk = String.valueOf(jk.getText().toString());

                String tHasil =
                        "Kode Mahasiswa : " + inputKode +
                                "\n" + "Nama Mahasiswa : " +
                                inputNama + "\n" + "Jenis Kelamin : " + inputJk + "\n"
                        + "Fakultas : " + spFakultas.getSelectedItem().toString() + "\n" +
                        "Prodi : " + spProdi.getSelectedItem().toString();

                Toast.makeText(MainActivity.this, tHasil, Toast.LENGTH_LONG).show();
                tvHasil.setText(tHasil);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edKode.setText("");
                edNama.setText("");
                tvHasil.setText("");
                spFakultas.setSelection(0);
                spProdi.setSelection(0);
                rgJk.clearCheck();
            }
        });
    }
}
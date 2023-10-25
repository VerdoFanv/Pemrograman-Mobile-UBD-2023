package com.example.formmahasiswa;

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
    Button bsimpan, bclear;
    EditText enpm, enama, etempatlahir, etanggallahir;
    TextView thasil;
    RadioGroup rgjk;
    Spinner skelas, sagama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        bsimpan = (Button) findViewById(R.id.simpan);
        bclear = (Button) findViewById(R.id.clear);
        enpm = (EditText) findViewById(R.id.isinpm);
        enama = (EditText) findViewById(R.id.isinama);
        etempatlahir = (EditText) findViewById(R.id.tempatlahir);
        etanggallahir = (EditText) findViewById(R.id.tanggallahir);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.jk);
        skelas = (Spinner) findViewById(R.id.kelas);
        sagama = (Spinner) findViewById(R.id.agama);

        bsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputnpm = String.valueOf(enpm.getText());
                String inputnama = String.valueOf(enama.getText());
                String inputtempatlahir = String.valueOf(etempatlahir.getText());
                String inputtanggallahir = String.valueOf(etanggallahir.getText());
                String inputkelas = skelas.getSelectedItem().toString();
                String inputagama = sagama.getSelectedItem().toString();

                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);
                String inputJk = String.valueOf(jk.getText());

                String textHasil = "\n" +
                        "NPM\t\t\t\t\t\t\t:" + inputnpm + "\n" +
                        "Nama\t\t\t\t\t\t\t:" + inputnama + "\n" +
                        "Jenis Kelamin\t\t:" + inputJk + "\n" +
                        "Kelas\t\t\t\t\t\t\t:" + inputkelas + "\n" +
                        "Agama\t\t\t\t\t\t:" + inputagama + "\n" +
                        "Tempat Lahir\t\t:" + inputtempatlahir + "\n" +
                        "Tanggal Lahir\t\t:" + inputtanggallahir + "\n";

                Toast.makeText(MainActivity.this, textHasil, Toast.LENGTH_LONG).show();
                thasil.setText(textHasil);
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enpm.setText("");
                enama.setText("");
                etempatlahir.setText("");
                etanggallahir.setText("");
                thasil.setText("");
                rgjk.clearCheck();
                skelas.setSelection(0);
                sagama.setSelection(0);
            }
        });
    }
}
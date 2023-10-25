package com.example.loginbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormHasil extends AppCompatActivity {
    Button bnBack;
    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_hasil);

        bnBack = findViewById(R.id.btnBack);
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);

        tv1.setText("Kode Mahasiswa: " + getIntent().getStringExtra("data1"));
        tv2.setText("Nama Mahasiswa: " + getIntent().getStringExtra("data2"));
        tv3.setText("Jenis Kelamin: " + getIntent().getStringExtra("data3"));
        tv4.setText("Fakultas: " + getIntent().getStringExtra("data4"));
        tv5.setText("Program Studi: " + getIntent().getStringExtra("data5"));

        bnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FormMahasiswa.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
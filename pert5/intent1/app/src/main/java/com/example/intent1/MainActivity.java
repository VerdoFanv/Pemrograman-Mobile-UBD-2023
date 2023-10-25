package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bnAbout, bnProduct, bnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnAbout = findViewById(R.id.btnAbout);
        bnProduct = findViewById(R.id.btnProduct);
        bnContact = findViewById(R.id.btnContact);

        bnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(getApplicationContext(), About.class);
                startActivity(aboutIntent);
                finish();
            }
        });

        bnProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productIntent = new Intent(getApplicationContext(), Product.class);
                startActivity(productIntent);
                finish();
            }
        });

        bnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(getApplicationContext(), Contact.class);
                startActivity(contactIntent);
                finish();
            }
        });
    }
}
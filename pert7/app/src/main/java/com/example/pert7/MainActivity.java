package com.example.pert7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button btnLogin;
    EditText edUsername, edPassword;

    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_facebook:
                    String url = "https://www.facebook.com/universitas.buddhi.dharma";
                    Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
                    bukaBrowser.setData(Uri.parse(url));
                    startActivity(bukaBrowser);
                    break;
                case R.id.menu_twitter:
                    String url2 = "https://www.twitter.com";
                    Intent bukaBrowser2 = new Intent(Intent.ACTION_VIEW);
                    bukaBrowser2.setData(Uri.parse(url2));
                    startActivity(bukaBrowser2);
                    break;
                case R.id.menu_instagram:
                    String url3 = "https://www.instagram.com/buddhidharma";
                    Intent bukaBrowser3 = new Intent(Intent.ACTION_VIEW);
                    bukaBrowser3.setData(Uri.parse(url3));
                    startActivity(bukaBrowser3);
                    break;
            }

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

        btnLogin = findViewById(R.id.btnLogin);
        edUsername = findViewById(R.id.txtusername);
        edPassword = findViewById(R.id.txtpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = String.valueOf(edUsername.getText());
                password = String.valueOf(edPassword.getText());

                if (username.equals("admin") && password.equals("admin")) {
                    Intent intent = new Intent(getApplicationContext(), FormMahasiswa.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Username atau password salah!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
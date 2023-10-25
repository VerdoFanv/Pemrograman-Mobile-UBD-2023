package com.example.loginbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
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
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.menu_facebook:
                    f = new FragmentFacebook();
                    break;
                case R.id.menu_twitter:
                    f = new FragmentTwitter();
                    break;
                case R.id.menu_instagram:
                    f = new FragmentInstagram();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, f).commit();

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
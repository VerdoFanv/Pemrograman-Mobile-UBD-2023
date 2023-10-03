package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1: {
                Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item2: {
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.item3: {
                Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.subitem1: {
                Toast.makeText(this, "Sub Item 1 Selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.subitem2: {
                Toast.makeText(this, "Sub Item 2 Selected", Toast.LENGTH_SHORT).show();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
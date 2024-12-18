package com.example.n0911_optionsmenu;

import android.os.Bundle;
import android.view.Menu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        public boolean onCreateOptionsMenu (Menu menu)
        {
            getMenuInflater().inflate(R.menu.menu_main, menu);

            return super.onCreateOptionsMenu(menu);
        }
    }

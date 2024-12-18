package com.example.n0911_optionsmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText firstIn, secIn;
    String firstStr, secStr;
    double firstNum, secNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        firstIn = findViewById(R.id.firstIn);
        secIn = findViewById(R.id.secIn);
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        String st = item.getTitle().toString();
        firstStr = firstIn.getText().toString();
        secStr = secIn.getText().toString();
        if(st.equals("+"))
        {
            if(firstStr.isEmpty() || secStr.isEmpty() || firstStr.equals(".") || secStr.equals(".") || firstStr.equals("-") || secStr.equals("-") || firstStr.equals("+") || secStr.equals("+") || firstStr.equals("+.") || secStr.equals("+.") || firstStr.equals("-.") || secStr.equals("-."))

                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();

            else
            {
                firstNum = Double.parseDouble(firstStr);
                secNum = Double.parseDouble(secStr);
                result.setText(String.valueOf(firstNum + secNum));
            }
        }

        if(st.equals("-"))
        {
            if(firstStr.isEmpty() || secStr.isEmpty() || firstStr.equals(".") || secStr.equals(".") || firstStr.equals("-") || secStr.equals("-") || firstStr.equals("+") || secStr.equals("+") || firstStr.equals("+.") || secStr.equals("+.") || firstStr.equals("-.") || secStr.equals("-."))

                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();

            else
            {
                firstNum = Double.parseDouble(firstStr);
                secNum = Double.parseDouble(secStr);
                result.setText(String.valueOf(firstNum - secNum));
            }
        }

        if(st.equals("*"))
        {
            if(firstStr.isEmpty() || secStr.isEmpty() || firstStr.equals(".") || secStr.equals(".") || firstStr.equals("-") || secStr.equals("-") || firstStr.equals("+") || secStr.equals("+") || firstStr.equals("+.") || secStr.equals("+.") || firstStr.equals("-.") || secStr.equals("-."))

                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();

            else
            {
                firstNum = Double.parseDouble(firstStr);
                secNum = Double.parseDouble(secStr);
                result.setText(String.valueOf(firstNum * secNum));
            }
        }

        if(st.equals("/"))
        {
            if(firstStr.isEmpty() || secStr.isEmpty() || firstStr.equals(".") || secStr.equals(".") || firstStr.equals("-") || secStr.equals("-") || firstStr.equals("+") || secStr.equals("+") || firstStr.equals("+.") || secStr.equals("+.") || firstStr.equals("-.") || secStr.equals("-.") || secStr.equals("0"))

                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();

            else
            {
                firstNum = Double.parseDouble(firstStr);
                secNum = Double.parseDouble(secStr);
                result.setText(String.valueOf(firstNum / secNum));
            }
        }

        if(st.equals("C"))
        {
            firstIn.setText("");
            secIn.setText("");
            result.setText("");
            firstStr = "";
            secStr = "";
            firstNum = 0;
            secNum = 0;
            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }
}

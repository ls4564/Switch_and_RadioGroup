package com.example.switchandradiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1,rb2,rb3,rb4;
    LinearLayout back;
    Switch Sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weddings();
    }
    public void weddings()
    {
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        back = findViewById(R.id.back);
        Sw = findViewById(R.id.Sw);
    }

    public void option(View view)
    {
        if(Sw.isChecked())
        {
            colors();
        }
    }

    public void btn_change(View view)
    {
        colors();
    }
    public void colors()
    {
        if(rb1.isChecked())
        {
            back.setBackgroundColor(Color.rgb(178,61,198));
        }
        else if(rb2.isChecked())
        {
            back.setBackgroundColor(Color.rgb(139,195,74));
        }
        else if(rb3.isChecked())
        {
            back.setBackgroundColor(Color.rgb(0,188,212));
        }
        else
        {
            back.setBackgroundColor(Color.rgb(234,223,131));
        }
    }

}

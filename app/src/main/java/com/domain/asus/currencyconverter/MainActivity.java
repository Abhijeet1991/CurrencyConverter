package com.domain.asus.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollarfield = (EditText) findViewById(R.id.dollarField);
        Double dollarAmount=Double.parseDouble(dollarfield.getText().toString());
        Double rupeeAmount=dollarAmount * 66.42;
        Toast.makeText(getApplicationContext(),"Rupee" + rupeeAmount.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

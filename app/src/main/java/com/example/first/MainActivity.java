package com.example.first;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button but = findViewById(R.id.button);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void Click(View view)
    {
        Integer B = null;
        Integer A = null;
        EditText a = (EditText) findViewById(R.id.editTextNumber);
        String As = a.getText().toString().trim();
        if(!As.isEmpty())
            A = Integer.parseInt(As);

        EditText b = (EditText) findViewById(R.id.editTextNumber2);
        String Bs = b.getText().toString().trim();
        if(!Bs.isEmpty())
            B = Integer.parseInt(Bs);

        String mi =  Min(A, B);
        String ma = Max(A, B);

        TextView min = (TextView) findViewById(R.id.textView7);
        TextView max = (TextView) findViewById(R.id.textView6);

        min.setText(mi);
        max.setText(ma);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    String Min(Integer x, Integer y)
    {
        if(x == null || y == null)
            return "Null";

        if(x < y)
            return x.toString();
        else
            return y.toString();
    }

    String  Max(Integer x, Integer y)
    {
        if(x == null || y == null)
            return "Null";

        if(x > y)
            return x.toString();
        else
            return y.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

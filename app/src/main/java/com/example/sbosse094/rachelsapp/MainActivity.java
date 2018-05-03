package com.example.sbosse094.rachelsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int state = 0;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state++;
                onResume();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatemen
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (state == 0) {
            textView.setText("Are you ready!?");
            button.setText("YES!!                                            duh...");
        } else if (state == 1) {
            textView.setText("First find out if you are unicorn or a BO$$");
            button.setText("Ok what ever you say");
        } else if (state == 2) {
            button.setText("Got it lets move on");
            textView.setText("If you like candy you are a unicorn, if you like cash money you are a BO$$");
        }else if (state==3)    {
            button.setText("Heading to the store NOW!");
            textView.setText("Now that you figured that out buy things that are printed with i'm a unicorn or i'm a BO$$ on them");
        }else if (state==4) {
            button.setText("Done and Done");
            textView.setText("When you get back from the store tell your friends and bragg to your enimies that you are a unicorn or a BO$$, and wear and carry your printed things around them ");
        }else if (state==5) {
            button.setText("Finally my dreams come true!!!");
            textView.setText("Now everybody knows you are a unicorn or a BO$$ and you will be rich and famous");
        }else if (state==6) {
            button.setText(" I'll go do something else now");
            textView.setText("the end");
        }else if (state==7) {
            button.setText("   ");
            textView.setText("you go do that.... please...... and don't come back...ever");
             //reset
            state=0;
        }
    }
}



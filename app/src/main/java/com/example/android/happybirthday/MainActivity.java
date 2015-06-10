package com.example.android.happybirthday;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{
private Button button1,button2,button3,button4,button5,button6;
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
        }

@Override
public void onClick(View v){
        CharSequence text="Hello toast!";

        switch(v.getId()){
        case R.id.button1:
        text="This button will launch Spotify Streamer app!";
        break;
        case R.id.button2:
        text="This button will launch Scores app!";
        break;
        case R.id.button3:
        text="This button will launch Library app!";
        break;
        case R.id.button4:
        text="This button will launch Buid it Bigger app!";
        break;
        case R.id.button5:
        text="This button will launch XYZ reader app!";
        break;
        case R.id.button6:
        text="This button will launch my capstone app!";
        break;

        }
        Toast toast=Toast.makeText(getApplicationContext(),
        text,Toast.LENGTH_LONG);
        toast.show();
        toast.setGravity(Gravity.BOTTOM, 0, 0);


        }


        }

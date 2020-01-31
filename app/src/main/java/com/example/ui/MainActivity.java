package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        linearLayout1=(LinearLayout)findViewById( R.id.onne );
        linearLayout2=(LinearLayout)findViewById( R.id.two );
        linearLayout3=(LinearLayout)findViewById( R.id.three );
        linearLayout1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               change();
            }
        } );
        linearLayout2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change();
            }
        } );
        linearLayout3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change2();
            }
        } );
    }
    public void change()
    {
        Intent intent;
        intent = new Intent( this,Main2Activity.class);
        startActivity( intent );
    }
    public void change2()
    {
        Intent intent;
        intent = new Intent( this,Main3Activity.class);
        startActivity( intent );
    }
}

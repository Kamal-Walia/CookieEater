package com.example.kamal.cookieeater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view) {
        ImageView img=(ImageView)findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);
        TextView txt=(TextView) findViewById(R.id.status_text_view);
        txt.setText("I'm so full");


    }
}

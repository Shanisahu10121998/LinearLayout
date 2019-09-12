package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RatingBar ratingBar;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar1);
        editText=findViewById(R.id.editText1);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                String s1=String.valueOf(editText.getText());
                Float f=ratingBar.getRating();
                Toast.makeText(MainActivity.this, "Movie NAme  "+s1+"Rating  "+f, Toast.LENGTH_SHORT).show();

            }
        });
    }
}

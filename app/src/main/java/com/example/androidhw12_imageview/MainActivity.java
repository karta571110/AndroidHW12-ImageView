package com.example.androidhw12_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean ch=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void ChangePeople(View View){

    ImageView imageview=(ImageView)findViewById(R.id.imageView);
    if(ch==true){
        imageview.setImageResource(R.drawable.sad);
    ch=false;
    }
    else {
        imageview.setImageResource(R.drawable.ugly);
        ch=true;
    }
}
}

package com.example.andela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView yona = (ImageView) findViewById(R.id.yonaMiti);
        int imageResource = getResources().getIdentifier("@drawable/yona", null, this.getPackageName());
        yona.setImageResource(imageResource);
    }
}

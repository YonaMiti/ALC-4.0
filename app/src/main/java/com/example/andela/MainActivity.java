package com.example.andela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button aboutAndela;
    private Button myProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutAndela = (Button) findViewById(R.id.about_Andela);
        aboutAndela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAndelaActivity();
            }
        });

        myProfile = (Button) findViewById(R.id.my_Profile);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfileActivity();
            }
        });

    }

    public void openAboutAndelaActivity(){
        Intent intent = new Intent(this, AboutAndela.class);
        startActivity(intent);
    }

    public void openMyProfileActivity(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }



}

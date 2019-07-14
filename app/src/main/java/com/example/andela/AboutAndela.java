package com.example.andela;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAndela extends AppCompatActivity {
    private WebView wV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_andela);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        wV = (WebView) findViewById(R.id.webView);

        wV.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });

        wV.getSettings().setJavaScriptEnabled(true);
        wV.getSettings().setDomStorageEnabled(true);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.getSettings().setAppCacheEnabled(true);
        wV.getSettings().setDatabaseEnabled(true);
        wV.getSettings().setDomStorageEnabled(true);
        wV.getSettings().setSupportZoom(true);
        wV.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wV.getSettings().setBuiltInZoomControls(true);
        wV.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        wV.loadUrl("https://andela.com/alc/");


    }

}

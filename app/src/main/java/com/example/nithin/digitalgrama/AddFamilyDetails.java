package com.example.nithin.digitalgrama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AddFamilyDetails extends AppCompatActivity {
    WebView myweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_family_details);
        WebView myweb=findViewById(R.id.myWebView);
        myweb.getSettings().setJavaScriptEnabled(true);
        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl("https://goo.gl/forms/rBf43TPRBHR3lOgq1");
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(AddFamilyDetails.this,HomeScreenActivity.class);
        finish();
        startActivity(i);
        return;
    }
}

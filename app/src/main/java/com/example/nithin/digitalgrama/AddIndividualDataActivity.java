package com.example.nithin.digitalgrama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AddIndividualDataActivity extends AppCompatActivity {
    WebView myweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_individual_data);

        myweb=(WebView)findViewById(R.id.myWebView);
        myweb.getSettings().getJavaScriptEnabled();
        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl("https://goo.gl/forms/W6w45KcqkVvcaaB83");

    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(AddIndividualDataActivity.this,HomeActivity.class);
        finish();
        startActivity(i);
        return;
    }
}

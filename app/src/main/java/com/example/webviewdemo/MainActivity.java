package com.example.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        //webView.loadUrl("https://google.com");

        webView.loadData("<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <header>\n" +
                "        <Title>Hello World</Title>\n" +
                "    </header>\n" +
                "    <body>\n" +
                "        <h1>Hello World</h1>\n" +
                "    </body>\n" +
                "</html>\n","text/html","UTF-8");
    }
}

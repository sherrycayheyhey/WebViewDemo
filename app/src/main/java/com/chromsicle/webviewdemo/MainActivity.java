package com.chromsicle.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

//remember to ask for INTERNET permission in the manifest :)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get access to the webview
        WebView coolWebView = findViewById(R.id.myWebView);

        //adjust a few settings of the
        //enables javascript
        coolWebView.getSettings().setJavaScriptEnabled(true);
        //opens page in the app instead of the phone's default browser
        coolWebView.setWebViewClient(new WebViewClient());
        //give the webview the URL to load
        coolWebView.loadUrl("http://www.google.com");

        //webviews can also load raw html
        //coolWebView.loadData("<html><body><h1>Hello World!</h1><p>This is my super awesome site!</p></body></html>", "text/html", "UTF-8");
        //this could be used for making apps on different devices so you just use the webview for android, iphone, etc. and you can use most the same code
    }
}

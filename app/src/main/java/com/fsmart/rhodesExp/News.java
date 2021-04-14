package com.fsmart.rhodesExp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class News extends Fragment {

    public WebView news;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        news = (WebView) view.findViewById(R.id.webView);
        String url = "https://greece.greekreporter.com/tag/rhodes/";

        news.loadUrl(url);

        return view;
    }
}

package com.fsmart.rhodesExp;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Top extends Fragment {

    public TextView site;
    public TextView tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        tx1 = (TextView)view.findViewById(R.id.text1);
        tx2 = (TextView)view.findViewById(R.id.text3);
        tx3 = (TextView)view.findViewById(R.id.text5);
        tx4 = (TextView)view.findViewById(R.id.text7);
        tx5 = (TextView)view.findViewById(R.id.text9);
        tx6 = (TextView)view.findViewById(R.id.text11);
        tx7 = (TextView)view.findViewById(R.id.text13);
        tx8 = (TextView)view.findViewById(R.id.text15);
        tx9 = (TextView)view.findViewById(R.id.text17);
        tx10 = (TextView)view.findViewById(R.id.text19);

        tx1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.444055,28.228260");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.0914899,28.088411?q=36.0914899,28.088411");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.2283515,28.1440351");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.1245168,27.7261581?q=36.1245168,27.7261581");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.0952258,28.0849697");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.340099,28.1999313");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.2358783,28.1495567?q=36.2358783,28.1495567");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.3214221,28.2093216?q=36.3214221,28.2093216");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.3366733,27.9212447?q=36.3366733,27.9212447");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        tx10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.4492793,28.2248777?q=36.4492793,28.2248777");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        site = (TextView)view.findViewById(R.id.site);
        site.setPaintFlags(site.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        site.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.touropia.com/tourist-attractions-in-rhodes/"));
                startActivity(browserIntent);
            }
        });

        return view;
    }
}

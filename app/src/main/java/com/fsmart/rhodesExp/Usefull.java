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
import android.widget.ImageView;
import android.widget.TextView;

public class Usefull extends Fragment {

    public TextView hosplink, pollink, cglink;
    public ImageView call1, call2, call3, call4;
    public TextView cctel1, cctel2, cctel3, cctel4;
    public ImageView image1, image2, image3, image4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usefull, container, false);

        // Hospital ================================================================================
        hosplink = (TextView)view.findViewById(R.id.hospsite);
        call1 = (ImageView)view.findViewById(R.id.call1);
        cctel1 = (TextView)view.findViewById(R.id.tel1);
        image1 = (ImageView)view.findViewById(R.id.image1);

        hosplink.setPaintFlags(hosplink.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        hosplink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rhodes-hospital.gr/"));
                startActivity(browserIntent);
            }
        });

        call1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + cctel1.getText().toString()));
                startActivity(intent);
            }
        });

        image1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.4180085,28.1928818?q=36.4180085,28.1928818");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        // Police ==================================================================================
        pollink = (TextView)view.findViewById(R.id.polsite);
        call2 = (ImageView)view.findViewById(R.id.call2);
        cctel2 = (TextView)view.findViewById(R.id.tel2);
        image2 = (ImageView)view.findViewById(R.id.image2);

        pollink.setPaintFlags(pollink.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        pollink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.astynomia.gr/index.php?option=ozo_content&perform=view&id=543&Itemid=96&lang="));
                startActivity(browserIntent);
            }
        });

        call2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + cctel2.getText().toString()));
                startActivity(intent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.4503421,28.2235732?q=36.4503421,28.2235732");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        // Coast Guard =============================================================================
        cglink = (TextView)view.findViewById(R.id.cgsite);
        call3 = (ImageView)view.findViewById(R.id.call3);
        cctel3 = (TextView)view.findViewById(R.id.tel3);
        image3 = (ImageView)view.findViewById(R.id.image3);

        cglink.setPaintFlags(cglink.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        cglink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hcg.gr/node/183"));
                startActivity(browserIntent);
            }
        });

        call3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + cctel3.getText().toString()));
                startActivity(intent);
            }
        });

        image3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.4500787,28.224689?q=36.4500787,28.224689");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        // Fire Department =========================================================================
        call4 = (ImageView)view.findViewById(R.id.call4);
        cctel4 = (TextView)view.findViewById(R.id.tel4);
        image4 = (ImageView)view.findViewById(R.id.image4);

        call4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + cctel4.getText().toString()));
                startActivity(intent);
            }
        });

        image4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:36.450352,28.224122?q=36.450352,28.224122");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return view;
    }
}

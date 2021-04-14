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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Contact extends Fragment {

    public EditText subject, mailtext,contInfo;
    public Button send;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        subject = (EditText) view.findViewById(R.id.subject);
        mailtext = (EditText) view.findViewById(R.id.mailtext);
        contInfo = (EditText) view.findViewById(R.id.contInfo);
        send = (Button) view.findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // send mail
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{"fsharp.source@gmail.com"});
                mail.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                mail.putExtra(Intent.EXTRA_TEXT, "Contact Info:\n" + contInfo.getText().toString()
                        + "\n\n" + mailtext.getText().toString());

                String title = "Send e-mail";
                mail.setType("message/rfc822");
                Intent chooser = Intent.createChooser(mail, title);
                startActivity(chooser);
            }
        });

        return view;
    }

}

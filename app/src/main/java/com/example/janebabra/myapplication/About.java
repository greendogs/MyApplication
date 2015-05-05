package com.example.janebabra.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
               {

            TextView v = (TextView) findViewById(R.id.text_target);
            v.setText(Html.fromHtml(getString(R.string.about_text)));
            v.setMovementMethod(LinkMovementMethod.getInstance());
            v.setLinksClickable(true);
        }
    }
}

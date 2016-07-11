package com.example.jago.fragmentworkout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DescriptionActivity extends Activity {
   public static String lose ="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        fragmentLifeDetail1 frag = (fragmentLifeDetail1) getFragmentManager().findFragmentById(R.id.detail_frag);
        int id =(int) getIntent().getExtras().get(lose);
    }
}

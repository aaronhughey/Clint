package com.example.craig.clint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailWesternActivity extends AppCompatActivity {
    public static final String EXTRA_WESTERN_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_western);
        WesternDetailFragment frag = (WesternDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int westernId = (int) getIntent().getExtras().get(EXTRA_WESTERN_ID);
        frag.setWestern(westernId);
    }
}

package com.example.craig.clint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailOtherActivity extends AppCompatActivity {
    public static final String EXTRA_OTHER_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_other);
        OtherDetailFragment frag = (OtherDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int otherId = (int) getIntent().getExtras().get(EXTRA_OTHER_ID);
        frag.setOther(otherId);
    }
}

package com.example.craig.clint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailDirtyActivity extends AppCompatActivity {
    public static final String EXTRA_DIRTY_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dirty);
        DirtyDetailFragment frag = (DirtyDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int dirtyId = (int) getIntent().getExtras().get(EXTRA_DIRTY_ID);
        frag.setDirty(dirtyId);
    }
}

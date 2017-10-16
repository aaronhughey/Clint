package com.example.craig.clint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainOtherActivity extends AppCompatActivity implements OtherListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_other);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            OtherDetailFragment details = new OtherDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setOther(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailOtherActivity.class);
            intent.putExtra(DetailOtherActivity.EXTRA_OTHER_ID, (int)id);
            startActivity(intent);
        }
    }
}
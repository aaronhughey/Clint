package com.example.craig.clint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainWesternActivity extends AppCompatActivity implements WesternListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_western);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            WesternDetailFragment details = new WesternDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWestern(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailWesternActivity.class);
            intent.putExtra(DetailWesternActivity.EXTRA_WESTERN_ID, (int)id);
            startActivity(intent);
        }
    }
}
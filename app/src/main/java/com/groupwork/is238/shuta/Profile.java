package com.groupwork.is238.shuta;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.groupwork.is238.shuta.frag.ProfileFragment;
import com.groupwork.is238.shuta.frag.ResultsFragment;

public class Profile extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initiateView();
        setSupportActionBar(toolbar);
        setContentView(R.layout.activity_profile);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.name);
            getSupportActionBar().setSubtitle(R.string.email_pro);
        }

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        changeFragment(new ProfileFragment());
    }

    private void initiateView() {
        toolbar = findViewById(R.id.toolbar);
    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    changeFragment(new ProfileFragment());
                    return true;
                case R.id.navigation_dashboard:
                    changeFragment(new ResultsFragment());
                    return true;
            }
            return false;
        }
    };


}

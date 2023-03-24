package com.example.tugas1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private ProfileFragment profileFragment = new ProfileFragment();
    private HomeFragment homeFragment = new HomeFragment();
    private SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomview);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,profileFragment).commit();
                return true;
            case R.id.menu:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();
                return true;
            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,settingFragment).commit();
                return true;
        }
        return false;
    }
}
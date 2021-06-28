package com.example.cherrycakes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class homeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    LinearLayout linearLayout;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView navigation_bar, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//
//        linearLayout = findViewById(R.id.nav1);
//        linearLayout.setBackgroundColor(Color.parseColor("#000"));
        navigationView = findViewById(R.id.navigation_view);
        drawerLayout = findViewById(R.id.drawerlayout);
        navigation_bar = findViewById(R.id.nav_bar);
        user = findViewById(R.id.user);

        navigationDrawer();

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                        replaceFragement(new userFragment());
            }
        });

    }



    private void navigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.home);

        navigation_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
        super.onBackPressed();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        if(id == R.id.home){
//            Intent intent = new Intent(DashboardActivity.this, DashboardActivity.class);
//            startActivity(intent);
//            finish();
            Toast.makeText(this, "Redirecting to DashBoard", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.search){
//            Intent intent = new Intent(DashboardActivity.this, SearchActivity.class);
//            startActivity(intent);
//            finish();
            Toast.makeText(this, "Redirecting to Search", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.cart){
//            Intent intent = new Intent(DashboardActivity.this, cartActivity.class);
//            startActivity(intent);
//            finish();
            Toast.makeText(this, "Redirecting to My Cart", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.account){
//            Intent intent = new Intent(getApplicationContext(), AccountActivity.class);
//            startActivity(intent);
//            finish();
            Toast.makeText(this, "Redirecting to My Account", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
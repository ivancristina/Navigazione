package com.ivancristina.navigazione;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CalculateActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

        private EditText phia_degrees;
        private EditText phia_minutes = (EditText) findViewById(R.id.phia_minutes);
        private EditText phia_seconds = (EditText) findViewById(R.id.phia_seconds);
        private EditText phib_degrees;
        private EditText phib_minutes = (EditText) findViewById(R.id.phib_degrees);
        private EditText phib_seconds = (EditText) findViewById(R.id.phib_degrees);
        private Button solve = (Button) findViewById(R.id.solve);
        private TextView result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                result.setText(String.valueOf(Double.parseDouble(phia_degrees.getText().toString()) + Double.parseDouble(phib_degrees.getText().toString())));
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_formule) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.content_formule, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.nav_esempi) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.content_esempi, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.nav_home) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.content_main, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_coord) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_coord, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_data) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_data, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_distance) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_distance, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_speed) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_speed, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_time) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_time, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        } else if (id == R.id.formule_windtr) {

            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.formule_windtr, null);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

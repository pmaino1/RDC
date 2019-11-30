package com.example.rdc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.Fragment;
import android.support.v4.*;
import android.os.Bundle;

/*BASIC IDEA/TODO:
- Dungeon Crawler
- Use a stationary Fragment at the bottom of the screen to display health and stuff
- Use an Extra carrying a custom class to carry around the player stats/inventory between views
- Different views for different rooms
*/

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        PlayerStats stats = new PlayerStats("Morgan");
        PlayerFragment fragment = (PlayerFragment) getFragmentManager().findFragmentByTag("fragment");
        fragment.linkStats(stats);
    }
}
